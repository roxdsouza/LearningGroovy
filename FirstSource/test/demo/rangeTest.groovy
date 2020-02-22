// Understanding ranges

// Creates a list of sequential values
// denoted by first and last value of the sequence

// 2 Types of ranges (inclusive and exclusive range)
// inclusive range 1..10
// exclusive range 1..<10   excludes 10

def range = 1..10

println range
println range.size()
println range.getFrom()
println range.getTo()

println '___________________'

assert range.from == 1
assert range.to == 10

println range.get(3)
println range[3]

println range.contains(7)
println range.contains(17)
println '___________________'

println range.reverse()
println range.isReverse()
def range1 = 10..1
println range1.isReverse()
println range1.subList(1,5)

def range2 = range.subList(2,5)
println range2.getFrom()
println range2.getTo()
println '___________________'

for(i in range) {
    println "Inside for loop: "+i
}

println '___________________'

range.each { i->
    println "Value = $i"
}

println '___________________'

println range instanceof java.util.List
