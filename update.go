package main

import (
	"github.com/flowcommerce/tools/executor"
)

func main() {
	executor := executor.Create("lib-reference-scala")
	executor = executor.Add("apidoc update")
	executor = executor.Add("go run script/generate.go")
	executor = executor.Add("echo version := \\\"`sem-info tag next`\\\" > VERSION.sbt")
	executor.Run()
}
