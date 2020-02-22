// Understanding List

// List is a structure to store collection of data items.

def fruits = ["apples","oranges","banana", "grapes"]

println fruits[1]
println fruits.get(2)

def myList = [1,2,3,4,5,["A","B","Groovy"],6.1,7.3]

println myList+[12]
println myList
println myList[7,5]
println myList[5]
println myList[5][2]
println myList.get(5).get(2)
println myList[6]

println myList[0..3]

// printing from last values
println myList[7..4]

// printing the contents of the list
println "------------------"
0.upto(myList.size()-1) { println myList[it] }

println "------------------"
println myList
println myList.contains(5)
println myList.contains("Groovy")
println myList[5].contains("Groovy")

println "------------------"
println myList.add(8.2)
println myList[5].add("JavaScript")

println myList.size()
println myList[5].size()

println "------------------"
0.upto(myList[5].size()-1) { println myList[5][it] }

println "------------------"
println myList<<"Canada"

myList.add(3, ["Cobol", "RPG", "CPP"])
myList.remove(10)
myList += [30,40]
myList = myList.plus([50])
println myList

myList -= [3,5]
myList = myList.minus([50])
println myList

// pop() removes the last element from the list
myList.pop()
println myList

myList.removeAt(6)

// Try in VS Code
// myList.removeLast()
myList.push("Rocks!")
println myList
println myList.intersect([8.2,4])

println "------------------"
myList = myList.sort()
println myList
myList = myList.reverse()
println myList
println "------------------"

println myList.isEmpty()
myList.clear()
println myList.isEmpty()
