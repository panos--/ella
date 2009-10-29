#!/bin/sh

mvn install:install-file -Dfile=./lib/ojdbc6.jar -Dpackaging=jar\
 -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.1.0

mvn install:install-file -Dfile=./lib/libreadline-java-0.8.0.jar -Dpackaging=jar\
 -DgroupId=org.gnu -DartifactId=readline -Dversion=0.8.0
