

// Test to understand operators
// For full list refer to:
// https://groovy-lang.org/operators.html

println "==========================="
// Normal arthmetic operators

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 /2 == 1.5
assert 10 % 3 == 1

// Will print an error if the assertion fails
// Change the value of the below to 7
assert 2 ** 3 == 8

println 9.intdiv(5)
assert 9.intdiv(5)
println 2.2.plus(1.1)
assert 2.2.plus(1.1)

println 3.3.minus(1.1)
println 5.multiply(2)

// Unary operators

assert +3 == 3
assert -4 == 0 - 4
assert -(-1) == 1

// increment and decrement

def a = 2
def b = a++ * 3             
assert a == 3 && b == 6

def c = 3
def d = c-- * 2             
assert c == 2 && d == 6

def e = 1
def f = ++e + 3             
assert e == 2 && f == 5

def g = 4
def h = --g + 1             
assert g == 3 && h == 4

// Assigned arthmetic operators

def a1 = 4
a1 += 3
assert a1 == 7

def b1 = 5
b1 -= 3
assert b1 == 2

def c1 = 5
c1 *= 3
assert c1 == 15

def d1 = 10
d1 /= 2
assert d1 == 5

def e1 = 10
e1 %= 3
assert e1 == 1

def f1 = 3
f1 **= 2
assert f1 == 9

// Relational operators

assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

// Logical operators

// "NOT" operator
assert !false           
println ("line 1: " + !false)

// "AND" operator. If one condition is false it will take it as false.
assert true && true   
println ("line 2: " + (true && true))

// Below line will show false. Uncomment to use.
// assert true && false   
println ("line 3: " + (true && false))

// "OR" operator. Even if one condition is true it will take it as true.
assert true || false 
println ("line 4: " + (true || false))

// Precedence

// The logical "not" has a higher priority than the logical "and".
assert (!false && false) == false
println ("line 5: " + ((!false && false) == false))

// The logical "and" has a higher priority than the logical "or".
assert true || true && false 
println ("line 6: " + (true || true && false))

println "==========================="
// Bitwise operator

// &: bitwise "and"
// |: bitwise "or"
// ^: bitwise "xor" (exclusive "or")
// ~: bitwise negation

int a2 = 20
int b2 = 25

println (a2 & b2)
println Integer.toBinaryString(20)  // 10100
println Integer.toBinaryString(25)  // 11001
                                    // 10000 (Using & operation)
println Integer.parseInt("10000",2)

println "==========================="

println (a2 ^ b2)
println Integer.toBinaryString(a2 ^ b2)

println "==========================="

println (a2 | b2)
println Integer.toBinaryString(a2 | b2)
println "==========================="

// Ternary operator

result = (5 < 3) ? "First value is greator" : "Second value is greator"
println result

println "==========================="

// Using "NOT" operator

println ((!true)    == false)                   
println ((!'foo')   == false)                   
println ((!'')      == true)
