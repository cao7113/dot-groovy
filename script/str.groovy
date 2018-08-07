#!/usr/bin/env groovy
println "hi groovy"

// String
assert 'c'.getClass() == String
assert "c".getClass() == String
assert "c${1}".getClass() in GString

// astarup.com/test --> astarup.com
def getHostName(str){
  // TODO
  println str.getClass()
  println str.split('/')
}

getHostName('astarup.com/test')

println "==ok"

/*
## Groovy Syntax 
== operator

In Java == means equality of primitive types or identity for objects. In Groovy == translates to a.compareTo(b)==0, if they are Comparable, and a.equals(b) otherwise. To check for identity, there is is. E.g. a.is(b)

block

Runnable run = { println 'run' }
list.each { println it } // or list.each(this.&println)
*/
