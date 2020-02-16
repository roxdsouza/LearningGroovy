

// Exception handling

// try-catch
// try-catch-finally
// try-finally

try {
    // To get ArithmeticException, uncomment the line below
    int i = 10 / 0
    //int i = "ABC"
}catch (ArithmeticException e) {
    println "I am in the ArithmeticException block"
    println "Exception is "+e
    println e.getMessage()
    println e.getCause()
    println e.printStackTrace()
}catch(Exception e){
    println "I am in the Exception block"  
    println "Exception is "+e
    println e.getMessage()
    println e.getCause()
    println e.printStackTrace()
} finally {
    
    // finally can exist without the catch block
    // There cannot be code existing between try and catch block
    // or try and finally block i.e. code after the try closing brace "}".
    
    // finally block will be executed always whether 
    // there is an exception or not.
    println "I am in the finally block"
}
