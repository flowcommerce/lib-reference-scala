package main

import (
	"github.com/flowcommerce/tools/executor"
)

func main() {
	executor := executor.Create("lib-reference-scala")
	executor = executor.Add("git checkout master")
	executor = executor.Add("git pull --rebase")

	executor = executor.Add("apibuilder update")
	executor = executor.Add("go get -u github.com/flowcommerce/json-reference/common")
	executor = executor.Add("go run script/generate.go")
	executor = executor.Add("sbt test")

	executor = executor.Add("echo version := \\\"`sem-info tag next`\\\" > VERSION.sbt")
	executor = executor.Add("git commit -a -m 'Auto create version `sem-info tag next`'")
	executor = executor.Add("dev tag")

	executor = executor.Add("sbt publish")
	executor.Run()
}
