package main

import (
	"github.com/flowcommerce/tools/executor"
)

func main() {
	executor := executor.Create("lib-reference-scala")
	executor = executor.Add("git checkout master")
	executor = executor.Add("git pull --rebase")
	executor = executor.Add("dev tag")
	executor = executor.Add("sbt publish")
	executor.Run()
}
