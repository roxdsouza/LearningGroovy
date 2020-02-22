// Understanding input / output operations

// Uncomment the below code in VSCode

/*
print "Enter your name: "

def name = System.console().readLine()

println "Hello $name"

print "Enter first number: "
def num1 = System.console().readLine().toInteger()
println ""
print "Enter second number: "
def num2 = System.console().readLine().toInteger()

println "$num1 + $num2 = "+ (num1+num2)
*/
// Formatting output

printf "%s | %s | %d | %.2f \n", "Rocky bhai", "Maharaja of Singapore", 10, 13.2
println ""
// - means left align and nothing means right align
printf "%-25s | %30s | %10d | %10.3f \n", "Rocky bhai", "Maharaja of Singapore", 10, 13.2
