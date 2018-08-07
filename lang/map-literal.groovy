#!/usr/bin/env groovy

// Map, known as associative array
// Map literals
def map = [name: 'Gromit', likes: 'cheese', id: 1234]
assert map.get('name') == 'Gromit'
assert map.get('id') == 1234
assert map['name'] == 'Gromit'
assert map['id'] == 1234
assert map instanceof java.util.Map

def emptyMap = [:]
assert emptyMap.size() == 0
emptyMap.put("foo", 5)
assert emptyMap.size() == 1
assert emptyMap.get("foo") == 5

def a = 'Bob'
def ages = [a: 43]
assert ages['Bob'] == null // `Bob` is not found
assert ages['a'] == 43     // because `a` is a literal!

//Note: escape to use var value using (a)
ages = [(a): 43]            // now we escape `a` by using parenthesis
assert ages['Bob'] == 43   // and the value is found!

//get a new copy of a map, to clone it:
def map1 = [
  simple : 123,
  complex: [a: 1, b: 2]
]
def map2 = map1.clone()
assert map2.get('simple') == map1.get('simple')
assert map2.get('complex') == map1.get('complex')
//Note: The resulting map is a shallow copy of the original one
map2.get('complex').put('c', 3)
assert map1.get('complex').get('c') == 3
