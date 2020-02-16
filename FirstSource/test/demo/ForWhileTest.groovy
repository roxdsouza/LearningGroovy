

// Using for and while loops
// https://groovy-lang.org/semantics.html

// For Loop

// If using more than one statement in the loop then 
// use {} brackets

for (int i = 0; i < 5; i++) {
    println i
}
    
println "-------"

for (int i in 5..1) {
    println i
}

println "-------"
    
// $it is iteration
1.upto(5) { println "$it" }

println "-------"

// Will start from 0
5.times { println "$it" }

println "-------"

1.step(10, 2) { println "$it" }

println "-------"

for (int i in [1,3,6,9,15,21]) {
    println i
}

println "-------"

def map = ["Name":"Sachin", "Address":"Bandra", "Occupation":"Cricketer"]

for (e in map) {
    print e.key + " : "
    println e.value
}

println "-------"

while (int i <= 5) {
    println i
    i++
}
