package com.example.booleans

/*Many times we come across a situation where we need to take decision
in Yes or No, or may be we can say True or
False. To handle such situation Kotlin has a Boolean
data type, which can take the values either true or false.*/

//Kotlin Boolean Operators
/*Operator	Name	Description	Example
&&	Logical and	Returns true if both operands are true	x && y
||	Logical or	Returns true if either of the operands is true	x || y
!	Logical not	Reverse the result, returns false if the operand is true	!x*/
fun main() {
println("------------------Create Boolean Variables---------")
    //Create Boolean Variables
    val isSummer: Boolean = true
    val isCold: Boolean = false

    println(isSummer)
    println(isCold)

    println("------------------ different calculations using Kotlin Logical Operators:---------")
    var x: Boolean = true
    var y:Boolean = false

    println("x && y = " +  (x && y))
    println("x || y = " +  (x || y))
    println("!y = " +  (!y))

    println("----------Kotlin provides and() and or() functions to perform logical AND and logical OR operations between two boolean operands.---------")

    val xx: Boolean = true
    val yy: Boolean = false
    val z: Boolean = true

    println("x.and(y) = " +  xx.and(yy))
    println("x.or(y) = " +  xx.or(yy))
    println("x.and(z) = " +  xx.and(z))


    var booleanValue:Boolean=true
    var stringValue:String

    stringValue=booleanValue.toString()

    println("booleanValue.toString()=> "+booleanValue.toString())
    println("stringValue=> "+stringValue)





}