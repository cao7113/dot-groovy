#!/usr/bin/env groovy

// http://groovy-lang.org/style-guide.html


/*

safe graph navigation
With ?. safe dereference operator, you can simplify such code with:
println order?.customer?.address

Groovy Truth
All objects can be 'coerced' to a boolean value: everything that’s null, void, equal to zero, or empty evaluates to false, and if not, evaluates to true.

So instead of writing:

if (name != null && name.length > 0) {}
You can just do:

if (name) {}
Same thing for collections, etc.


Elvis operator for default values
The Elvis operator is a special ternary operator shortcut which is handy to use for default values.
We often have to write code like:

def result = name != null ? name : "Unknown"
Thanks to Groovy Truth, the null check can be simplified to just 'name'.

And to go even further, since you return 'name' anyway, instead of repeating name twice in this ternary expression, we can somehow remove what’s in between the question mark and colon, by using the Elvis operator, so that the above becomes:

def result = name ?: "Unknown"


Optional typing advice
I’ll finish on some words on when and how to use optional typing. Groovy lets you decide whether you use explicit strong typing, or when you use def.

I’ve got a rather simple rule of thumb: whenever the code you’re writing is going to be used by others as a public API, you should always favor the use of strong typing, it helps making the contract stronger, avoids possible passed arguments type mistakes, gives better documentation, and also helps the IDE with code completion. Whenever the code is for your use only, like private methods, or when the IDE can easily infer the type, then you’re more free to decide when to type or not.
*/
