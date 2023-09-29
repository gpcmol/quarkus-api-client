#!/bin/bash
export JAVA_HOME="~/.sdkman/candidates/java/21-open/"
set | grep JAVA_HOME
quarkus dev
