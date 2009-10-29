#!/bin/sh

set -e

usage() {
	ME="`basename "$0"`"
	echo >&2 "usage: $ME <file> <packaging> <groupId> <artifactId> <version>"
	exit 1
}

SCRIPT_DIR="`dirname "$0"`"
cd "$SCRIPT_DIR"
SCRIPT_DIR="`pwd`"
cd -

PROJ_HOME="`dirname "$SCRIPT_DIR"`"
export PROJ_HOME

echo SCRIPT_DIR="$SCRIPT_DIR"
echo PROJ_HOME="$PROJ_HOME"

[ $# = 5 ] || usage

FILE="$1"
PKG="$2"
GROUP="$3"
ARTIFACT="$4"
VERSION="$5"

# Maven changes it's working directory to the directory where
# the given pom.xml is located. This requires us to turn $FILE
# into an absolute path if it is given as a relative one.
case "$FILE" in
	/*) ;;
	*) FILE="`pwd`/$FILE";;
esac

# We have to specify the project's pom.xml explicitly here or
# nothing will work.
set -x
mvn -f "$PROJ_HOME/pom.xml" \
	install:install-file \
	-DlocalRepositoryPath="$PROJ_HOME"/maven/repository \
	-Dfile="$FILE" \
	-Dpackaging="$PKG" \
	-DgroupId="$GROUP" \
	-DartifactId="$ARTIFACT" \
	-Dversion="$VERSION"
