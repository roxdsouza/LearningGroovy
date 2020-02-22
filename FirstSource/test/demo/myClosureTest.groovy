// Understanding closures

// Closures are block of code that can:
// -take parameters
// -refer variables
// -return values
// can be passed as a parameter in a method

def str = "Hello"

def myClosure1 = { name -> println "$str $name" }

myClosure1.call("Rocky Bhai")

def myMethod(closure) {
    closure.call("Raghav")
}

myMethod(myClosure1)

def myClosure2 = { a,b,c -> return (a+b+c) }

println myClosure2(10,10,10)

def myList1 = ["Apples", "Oranges", "Grapes"]
print myList1.each { it } 

println ""

def myMap = [
    'name'  :   'Raghav',
'subject'   :   'Groovy'
    ]    
println myMap.each { it }

def myList = [1,2,3,4,5]
println myList.find { item -> item == 3}
println myList.find { item -> item == 6}
println myList.findAll { item -> item > 3}
println myList.any { item -> item > 3}

// Checks if every item in the list is greater than 3
println myList.every { item -> item > 3}
println myList.every { item -> item > 0}

println myList.collect { item -> item * 3}
