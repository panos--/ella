#!/bin/sh

mvn install:install-file -Dfile=./lib/libreadline-java-0.8.0.jar -Dpackaging=jar\
 -DgroupId=org.gnu -DartifactId=readline -Dversion=0.8.0
