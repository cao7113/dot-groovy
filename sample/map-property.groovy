#!/usr/bin/env groovy

// Map property notation
// Maps also act like beans so you can use the property notation to get/set items inside the Map as long as the keys are strings which are valid Groovy identifiers:

def map = [name: 'Gromit', likes: 'cheese', id: 1234]
assert map.name == 'Gromit'     // can be used instead of map.get('name')
assert map.id == 1234

def emptyMap = [:]
assert emptyMap.size() == 0
emptyMap.foo = 5
assert emptyMap.size() == 1
assert emptyMap.foo == 5

// Note: by design map.foo will always look for the key foo in the map. This means foo.class will return null on a map that doesn’t contain the class key. Should you really want to know the class, then you must use getClass():

def map1 = [name: 'Gromit', likes: 'cheese', id: 1234]
assert map1.class == null
assert map1.get('class') == null
assert map1.getClass() == LinkedHashMap // this is probably what you want

map1 = [1      : 'a',
       (true) : 'p',
       (false): 'q',
       (null) : 'x',
       'null' : 'z']
assert map1.containsKey(1) // 1 is not an identifier so used as is
assert map1.true == null
assert map1.false == null
assert map1.get(true) == 'p'
assert map1.get(false) == 'q'
assert map1.null == 'z'
assert map1.get(null) == 'x'
