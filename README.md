# lib-reference-scala

Scala library providing convenient and fast access to reference data

## Source Data

This library wraps the source data provided by the [Flow Reference Project](https://github.com/flowcommerce/json-reference)

## Installation

  ```
      "io.flow" %% "lib-reference-scala" % "1.0.0"
  ```

## Example

  Find a country by 2 or 3 character iso code, or exact name
  ```
  Countries.find("CH")
  ```

  Same as above, but throws an error if not found
  ```
  Countries.mustFind("CHN")
  ```

  Iterate through all countries:
  ```
  data.Countries.all.foreach { c =>
    println(c.name)
  }
  ```

  Validate input, returning a friendly error message:
  ```
  Countries.validate(Seq("Fra", "Mars"))
  ```
  

## More examples

We recommend viewing the project tests to see detailed usage examples
for all of the types of reference data:

  [Scala Tests](/src/test/scala/io/flow/reference/)

## Updating to latest models

```
    git checkout -b <release_branch>
    go run release.go
    git pull-request
```
