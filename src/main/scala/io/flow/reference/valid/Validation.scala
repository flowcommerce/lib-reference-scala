package io.flow.reference.valid

import cats.data.ValidatedNec
import cats.implicits._
import io.flow.reference.Reference

/** A trait that allows a type `T` to be validated as an Either
  */
trait Validation[T] extends Reference[T] {

  def validateSingle(
    id: String,
    prefix: Option[String] = None,
    suffix: Option[String] = None,
  ): ValidatedNec[String, T] = {
    val trimmed = id.trim
    find(trimmed).toValidNec(
      singleInvalid(trimmed, prefix.getOrElse(""), suffix.getOrElse("")),
    )
  }

  /** Validates a list of ids for the given type `T`.
    * @param ids
    *   The ids to validate.
    * @param prefix
    *   A prefix to place before the singular or plural of `T`, such as "destination" to yield "destination country" or
    *   "destination countries" if `T` is `Country`.
    * @param suffix
    *   A suffix to place after the singular or plural of `T`, such as "of origin" to yield "country of origin" or
    *   "countries of origin" if `T` is `Country`.
    */
  def validate(
    ids: Seq[String],
    prefix: Option[String] = None,
    suffix: Option[String] = None,
  ): ValidatedNec[String, Seq[T]] = {
    val distinctTrimmedIds = ids.map(_.trim).distinct
    val strictlyInvalidIds = distinctTrimmedIds.filterNot { id => validateSingle(id).isValid }

    invalidError(strictlyInvalidIds, prefix.getOrElse(""), suffix.getOrElse("")) match {
      case Nil => distinctTrimmedIds.map(mustFind).validNec
      case errors => errors.map(_.invalidNec).sequence
    }
  }
}
