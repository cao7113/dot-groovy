#!/usr/bin/env groovy

// List literals
// Each list expression creates an implementation of java.util.List.
def list = [5, 6, 7, 8]
assert list.get(2) == 7
//indexing starts at 0
assert list[2] == 7
assert list instanceof java.util.List
println "list type: ${list.getClass()}"
assert list.getClass() == ArrayList 
assert list == [5, 6, 7, 8,]           // trailing comma OK

def emptyList = []
assert emptyList.size() == 0
emptyList.add(5)
assert emptyList.size() == 1

//objects can be of different types; duplicates allowed
assert ['a', 1, 'a', 'a', 2.5, 2.5f, 2.5d, 'hello', 7g, null, 9 as byte]

assert [1, 2, 3, 4, 5][-1] == 5             // use negative indices to count from the end

assert [1, 2, 3, 4, 5][-2] == 4
assert [1, 2, 3, 4, 5].getAt(-2) == 4       // getAt() available with negative index...
try {
    [1, 2, 3, 4, 5].get(-2)                 // but negative index not allowed with get()
    assert false
} catch (e) {
    assert e instanceof IndexOutOfBoundsException
}

assert ![]             // an empty list evaluates as false

//all other lists, irrespective of contents, evaluate as true
assert [1] && ['a'] && [0] && [0.0] && [false] && [null]


[1, 2, 3].each {
    println "Item: $it" // `it` is an implicit parameter corresponding to the current element
}
['a', 'b', 'c'].eachWithIndex { it, i -> // `it` is the current element, while `i` is the index
    println "$i: $it"
}



