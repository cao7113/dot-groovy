#!/usr/bin/env groovy
// http://groovy-lang.org/structure.html

/*
package com.yoursite
import groovy.xml.MarkupBuilder

The below imports are added by groovy for you:

import java.lang.*
import java.util.*
import java.io.*
import java.net.*
import groovy.lang.*
import groovy.util.*
import java.math.BigInteger
import java.math.BigDecimal

import static Calendar.getInstance as now

*/

import static Calendar.getInstance as now

assert now().class == Calendar.getInstance().class

import static Boolean.FALSE

assert !FALSE //use directly, without Boolean prefix!

// static star import
import static java.lang.Math.*
// use static methods directly
assert sin(0) == 0.0
assert cos(0) == 1.0

import java.util.Date
// define a aliasing
import java.sql.Date as SQLDate

Date utilDate = new Date(1000L)
SQLDate sqlDate = new SQLDate(1000L)
assert utilDate instanceof java.util.Date
assert sqlDate instanceof java.sql.Date

// define a method
int fib(int n) {
    n < 2 ? 1 : fib(n-1) + fib(n-2)
}

assert fib(10)==89


/*

Variables in a script do not require a type definition. This means that this script:

int x = 1
int y = 2
assert x+y == 3
will behave the same as:

x = 1
y = 2
assert x+y == 3
However there is a semantic difference between the two:

特别注意这里的作用域问题，无类型类似全局可用(有类型则变成生成run方法的局部变量), 在groovysh中可以试验下

if the variable is declared as in the first example, it is a local variable. It will be declared in the run method that the compiler will generate and will not be visible outside of the script main body. In particular, such a variable will not be visible in other methods of the script

if the variable is undeclared, it goes into the script binding. The binding is visible from the methods, and is especially important if you use a script to interact with an application and need to share data between the script and the application. Readers might refer to the integration guide for more information.

If you want a variable to become a field of the class without going into the Binding, you can use the @Field annotation.

*/
