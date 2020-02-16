// Understanding methods

def sum(int a, int b) {
    println "Sum is " + (a+b)
}

def multiply(int a = 5, int b = 7) {
    println "Product is "+(a*b)
}

def printHello() {
    println "Hello World!"
}

def subtract(int a, int b) {
    return "Subtracted value is "+(a-b)
}

printHello()
sum(10,15)
multiply()  // Will take default parameters
multiply(8,3)  // Will take the suppllied values
multiply(9)

println subtract(10,3)
