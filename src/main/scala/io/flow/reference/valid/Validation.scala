package io.flow.reference.valid

import cats.data.ValidatedNec
import cats.implicits._
import io.flow.reference.Reference

/*
 * @param prefix
 *   A prefix to place before the singular or plural of `T`, such as "destination" to yield "destination country" or
 *   "destination countries" if `T` is `Country`.
 * @param suffix
 *   A suffix to place after the singular or plural of `T`, such as "of origin" to yield "country of origin" or
 *   "countries of origin" if `T` is `Country`.
 */
case class Grammar(
  prefix: Option[String],
  suffix: Option[String],
)
object Grammar {
  val None: Grammar = Grammar(prefix = None, suffix = None)
}

/** A trait that allows a type `T` to be validated as an Either
  */
trait Validation[T] extends Reference[T] {

  def validate(
    id: String,
  )(implicit
    grammar: Grammar = Grammar.None,
  ): ValidatedNec[String, T] = {
    val trimmed = id.trim
    find(trimmed).toValidNec(
      singleInvalid(trimmed, prefix = grammar.prefix.getOrElse(""), suffix = grammar.suffix.getOrElse("")),
    )
  }

  /** Validates a list of ids for the given type `T`.
    * @param ids
    *   The ids to validate.
    */
  def validate(
    ids: Seq[String],
  )(implicit
    grammar: Grammar = Grammar.None,
  ): ValidatedNec[String, Seq[T]] = {
    val distinctTrimmedIds = ids.map(_.trim).distinct
    val strictlyInvalidIds = distinctTrimmedIds.filterNot { id => validate(id).isValid }

    invalidError(strictlyInvalidIds, grammar.prefix.getOrElse(""), grammar.suffix.getOrElse("")) match {
      case Nil => distinctTrimmedIds.map(mustFind).validNec
      case errors => errors.map(_.invalidNec).sequence
    }
  }
}
