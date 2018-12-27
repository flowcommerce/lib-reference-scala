package io.flow.reference

/**
 *  A trait that allows a type `T` to be validated, as long as the following are defined:
 */
trait Validation[T] {

  /**
    * The singular form of `T`; for example, "country".
    */
  def singular: String

  /**
    * The plural form of `T`; for example, "countries".
    */
  def plural: String

  /**
    * A map of valid keys to the objects of type `T` that they represent.
    */
  def cache: Map[String, T]

  /**
    * A method that returns the name (or other property that returns a string) to use in validation error messages for each object of type `T`.
    */
  def name(t: T): String

  /**
    * Key in URL for reference data. Defaults to plural
    */
  def urlKey: String = plural

  def find(q: String): Option[T] = {
    cache.get(q.toLowerCase.trim)
  }

  /** Attempts to find a single object; if it cannot be found, validates it to return an error message. */
  def mustFind(q: String): T = {
    find(q) getOrElse {
      sys.error(singleInvalid(q))
    }
  }

  // Method aliases to preserve existing methods used by `Regions`
  def findById = find _
  def mustFindById = mustFind _

  private[this] def formatted(value: String): String = value match {
    case "" => ""
    case _ => s" $value"
  }

  // This needs to be a method since the value of `plural` is not known at compile time. Making it a `val` causes `$plural` to interpolate as `null`.
  private[this] def referenceLink = s"See https://api.flow.io/reference/$urlKey for a list of all valid $plural."

  // This needs to be a method, rather than a val, for the same reason above.
  private[this] def pluralReferenceLink = plural match {
    case "countries" => s"The provided country codes must be valid ISO 3166-2 or 3166-3 codes. $referenceLink"
    case _ => referenceLink
  }

  // This needs to be a method, rather than a val, for the same reason above.
  private[this] def singularReferenceLink = plural match {
    case "countries" => s"The provided country code must be a valid ISO 3166-2 or 3166-3 code. $referenceLink"
    case _ => referenceLink
  }

  private[this] def singleInvalid(id: String, prefix: String = "", suffix: String = ""): String = {
    s"The following${formatted(prefix)} $singular${formatted(suffix)} is invalid: [$id].${formatted(singularReferenceLink)}"
  }

  private[this] def manyInvalid(ids: Seq[String], prefix: String, suffix: String): String = {
    s"The following${formatted(prefix)} $plural${formatted(suffix)} are invalid: " + ids.map(id => s"[$id]").mkString(", ") + s".${formatted(pluralReferenceLink)}"
  }

  def invalidError(ids: Seq[String], prefix: String = "", suffix: String = ""): Seq[String] = {
    ids match {
      case Nil => Nil
      case one :: Nil => Seq(singleInvalid(one, prefix, suffix))
      case multiple => Seq(manyInvalid(multiple, prefix, suffix))
    }
  }

  def validateSingle(id: String, prefix: String = "", suffix: String = ""): Either[String, T] = {
    val trimmed = id.trim
    find(trimmed) match {
      case Some(value) => Right(value)
      case None => Left(singleInvalid(trimmed, prefix, suffix))
    }
  }

  /**
   *  Validates a list of ids for the given type `T`.
   *  @param ids The ids to validate.
   *  @param prefix A prefix to place before the singular or plural of `T`, such as "destination" to yield "destination country" or "destination countries" if `T` is `Country`.
   *  @param suffix A suffix to place after the singular or plural of `T`, such as "of origin" to yield "country of origin" or "countries of origin" if `T` is `Country`.
   */
  def validate(ids: Seq[String], prefix: String = "", suffix: String = ""): Either[Seq[String], Seq[T]] = {
    val distinctTrimmedIds = ids.map(_.trim).distinct
    val strictlyInvalidIds = distinctTrimmedIds.filterNot { id => validateSingle(id).isRight }

    invalidError(strictlyInvalidIds, prefix, suffix) match {
      case Nil => Right(distinctTrimmedIds.map(mustFind))
      case errors => Left(errors)
    }
  }
}
