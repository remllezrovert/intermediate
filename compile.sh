#!/bin/sh
#javac -classpath src/java111/$1 src/java111/$1/$2.java 

#javac -classpath src/java111/$1 src/java111/$1/$2/*.java


javac -classpath classes -d classes src/java111/$1/$2.java
#javac -classpath classes -d classes src/java111/project5/labs/$1.java

