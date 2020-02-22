//Understanding maps

// Map is a collection that contains key:value pairs
// It is an unordered collection
// [:] - is an empty map

def employee = [
    'name' : 'John',
    'age' : 50
    ]
    
println employee
println employee.name
println employee['name']
println employee.get('age')
println employee.getAt('age')

println '----------------'
println employee.size()
employee.put('city', 'Mumbai')
println employee
println employee.containsKey('city')
println employee.containsValue('Paris')
println employee.containsValue('Mumbai')

println '----------------'
println employee.getClass()

def employee2 = employee.clone()
println employee2

println '----------------'

employee.each { key,value -> 
    println "$key : $value" 
}

println '----------------'

employee.eachWithIndex { key,value, i ->
    println "$i | $key : $value" 
}

println '----------------'

employee.eachWithIndex { entry, i->
    println "$i | $entry.key : $entry.value" 
}

println 'xxxxxxxxxxxxxxxxxxx'
def map1 = ['a':1,'b':2]
def entries = map1.entrySet()

println entries
entries.each { entry ->
    assert entry.key in ['a','b']
    assert entry.value in [1,2]
    println entry.key in ['a','b']
    println entry.value in [1,2,3]
}

employee.clear()
println employee
println 'xxxxxxxxxxxxxxxxxxx'
