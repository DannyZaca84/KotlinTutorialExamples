fun main(args: Array<String>){
    //REPL-> Read, Eval, Print, Loop
    //tools -> Kotlin -> REPL
    //REPL is a helpful tool to test code without running the whole project.

    //Examples of string interpolation
    //Example 1
//region Strings
    val name = "Daniel"
    val str = "Hola $name"
    print("The Statement is $str.\n\nThe number of characters in the statement is ${str.length}")

    //Example 2
    val a = 10
    val b = 5

    print("\n\nThe sum of $a and $b is ${a + b}")

    //Example 3
    var rect = Rectangle()
    rect.length = 5
    rect.breadth = 13


    print("\n\nThe length of the rectangle is ${rect.length} and breadth is ${rect.breadth}.\n\nThe Area is ${rect.length * rect.breadth}\n\n")
    //endregion
//region Ranges Example
    //Ranges and Double Dot Operators =

    //Ranges
    val r1 = 1..5
    // This range contains the numbers 1, 2, 3, 4, 5.
    val r2 = 5 downTo 1 // To get the values counting in reverse
    // This range contains the number 5, 4, 3, 2, 1.

    val r3 = 20 downTo 1 step 2
    // This range contains the number 19, 17, 15, 13, 11, 9...

    val r4 = 'a'..'z'
    // This range contains the values "a", "b", "c".... "z"

    //to test
    var isPresent = 't' in r4

    var countDown = 10.downTo(1)
    // This range contains the number 10, 9, 8, 7, 6, 5, 4...1.

    var moveUp = 1.rangeTo(20)
    // This range contains the number 1, 2, 3, 4...10
//endregion
//region IF as Expression
    //IF statement
    val c = 2
    val d = 5
//
//    var maxValue: Int
//    if (a>b)
//        maxValue = c
//    else
//        maxValue = d
//
//    println(maxValue)
//
    //If as an expression
    var maxValue:Int = if(c > d) {
        print("c is greater")
        c
    }else {
        print("d is greater")
        d

    }
    println("\n\n" + maxValue)





    //endregion
//region WHEN as expression
    //this is the replacement of the switch case statement
    val x = 12



    when (x){

        0, 1 -> println("x is 0 OR 1")
        2 -> println("x is 2")
        !in 1..20 -> println("x lies in 1 to 20")
        else -> {
            println("x value is unknown")
            println("I don't know what is x")

        }


    }
    // WHEN as Expression

    var str2: String
    when (x){
        1-> str2 = "x is 1"
        2-> str2 = "x is 2"
        else -> {
            str2 = "x value is unknown"
            println("I don't know what is x")

        }
    }






        //endregion
    //region Iterators [LOOPS] Example
        // For loop example
        // the ".." means the range of numbers, refer to "Ranges Example" if need it
    for(i in 1..10){

        if(i % 2 == 0)//it will display only even numbers, "i % 2 == 0" divides the range and display numbers that divided by two the remainder is 0

        println(i)
    }
    //While Loop Example

    //Initialize the counter value for "i" in this example
    var i: Int =1
    while(i <= 10)
    {
        //to print only even numbers add the the next if statement
        if (i %2 == 0) {
            println(i)
        }
        //increment the value of i
        i++
    }

    //To print all the even numbers used this next while loop

    //endregion


}
class Rectangle{
    var length: Int = 0
    var breadth: Int = 0
}