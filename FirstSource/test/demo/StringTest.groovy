// Test programs in https://groovy-playground.appspot.com/
// Documentation - https://groovy-lang.org/syntax.html

/*
In this program tested strings along with:

Strings                         Multiline   Interpolation (data from variable)

single quoted '...'                             
double quoted "..."                             Y
triple single quoted '''...'''      Y
triple double quoted """..."""      Y           Y
slash /.../                         Y           Y
dollar slash $/.../$                Y           Y   

*/

def name = "Rocky"
println "My name is " + name
println "My name is ".concat(name)
println "My name is $name"
println "My name is ${name}"

// Single quote: Cannot print the value of the variable: name
println 'My name is ${name}'

println "------------Using double quote------------"
def s1 = """Hello everyone
This is your boss!"""
println s1

println "------------Using single quote------------"

s1 = '''Come on monsters
I can beat the crap out of you ALL'''
println s1

println "------------------------"

println "Length of s1 is: " + s1.length()
println "First character of s1 is: " + s1[0]
println "Last character of s1 is: " + s1[-1]
println "Printing index of letter m in s1: " + s1.indexOf('m')
println "Printing 8th to 15th characters in s1: " + s1[8..15]
println "Printing from the end of s1: " + s1[50..0]
println "Printing random characters of s1: " + s1[0,1,3,5]

println "Using substring: " + s1.substring(23)
println "Using substring: " + s1.substring(8,15)
println "------------------------"

def str = "This is a groovy class"
def str1 = ""

println str
str1 = str.split(' ')
println str1[4]
println str-("groovy ")
println str.replace("class", "session")
println str

println "------------------------"
println str.toLowerCase()
println str.toUpperCase()

println str.toList()
println str * 3

println "Abc".equals("abc")
println "Abc".equals("Abc")
println "Abc".equalsIgnoreCase("abc")

println "------------------------"

// Useful for printing escape characters

def str2 = /a Green sky 
    "$name Bhai"/
def str3 = $/a Blue tree
    "$name Bhai"/$
    
println str2
println str3


// Need to use "\" to escape a character

def str5 = "Red water \"Rocky Bhai\""
println str5
