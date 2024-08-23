# lib-reference-scala

Scala library providing convenient and fast access to reference data

## Adding new reference data

Changes should not be done to this repository direcly.

This library wraps the source data provided by the [Flow Reference Project](https://github.com/flowcommerce/json-reference).
Therefore, if new reference data needs to be added, it should be added to [json-reference](https://github.com/flowcommerce/json-reference) first. 
After changes are merged in the [json-reference](https://github.com/flowcommerce/json-reference), the code generate has to be invoked here.

Find more details about how references are organized and managed [here](https://www.notion.so/flow/References-bd8b9b8f5c434d21aa0bf1c0b98e6d66).

## Installation

  ```
      "io.flow" %% "lib-reference-scala" % "0.1.43"
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

## Invoking the code generator

```
    go run script/generate.go
    sbt compile
```
