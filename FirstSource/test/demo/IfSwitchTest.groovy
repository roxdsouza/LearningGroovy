


// Using if..else
// Using switch..case

def num = "A"

// If multiple lines need to be included then better to use {} brackets

if (num > 0)
    println "Number is Positive"
else if (num == 0)
    println "Number is Zero"
else
    println "Number is Negative"
    
// Using switch 

def result = ""

switch (num) {
    case 0:
        result = "Number is Zero"
        break
    case {num > 0}:
        result = "Number is Positive"
        break
    case {num < 0}:
        result = "Number is Negative"
        break
    default:
        result = "Invalid entry"
}

println result
