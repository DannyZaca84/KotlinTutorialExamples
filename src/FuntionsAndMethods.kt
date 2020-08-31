fun main(args: Array<String>){
    var sum = add(2,4)
    println("Sum is $sum")

    //IF/When example
    var largValue = max(4,6)
    println("The grater number is $largValue")




}
//region Kotlin Functions and Methods Examples
// function example
//fun findArea(length: Int, breadth: Int): Int
//    Method Name (Argument, Argument)Return type, replace "Int" with "Unit" and is the equivalent  as a "Void" in Java

fun add(a: Int, b:Int): Int{
return a + b

}


//endregion

//region Functions as Expressions Examples If and WHEN expressions
//fun max(a:Int, b: Int):Int {
//
//    if (a>b)
//        return a
//    else
//        return b
//}
//This code can be optimized as follow (same statement)
//fun max (a: Int, b: Int): Int = if (a>b) a else b//this can be converted into a body, as follow

fun max(a: Int, b: Int): Int = if (a > b) {
    println("$a is greater\n")
    a
} else {
    println("$b is greater\n")
    b

}


//endregion