package com.example.range

fun main() {
    //Creating Ranges using rangeTo()
    funRangeTo()

    //Creating Ranges using rangeTo()
    funOperator()
//If we want to define a backward range we can use the downTo operator:
    funDownTo()
    //  We can use step() function to define the distance between the values of the range. Let's
    //  have a look at the following example:
    funStep()
//The function reversed() can be used to reverse the values of a range.
    funReversed()
//We can use first, last and step properties of a range to find the first,
// the last value or the step of a range.
    funLastFirstStep()
//The filter() function will return a list of elements matching a given predicate:
    funFiltering()
// function will return a list of distinct values from a range having repeated values:
    funDistinct()
}

fun funRangeTo() {
    //Creating Ranges using rangeTo()
    for (i in 1.rangeTo(5)) {
        println(i)
    }
}

fun funOperator() {
    // operator form ... So the above code can be re-written using ..
    println("--------------- operator form ... So the above code can be re-written using .. -------------")
    for (i in 1..10) {
        println(i)
    }
}

fun funDownTo() {
    // operator form ... So the above code can be re-written using ..
    println("----------Creating Ranges using downTo() Operator----------")
    for (i in 5 downTo (1)) {
        println(i)
    }
}

fun funStep() {
    println("-------------distance between the values---------------")
    for (i in 1..10 step 2) {
        println(i)
    }
}
fun funReversed() {
    println("-------------used to reverse the values of a range.---------------")
    for (i in (1..10).reversed()) {
        println(i)
    }
}


fun funLastFirstStep(){
    println("--------first element and last element----------------------")
    println((1..5).first)
    println((1..5).last)
    println((1..10 step 2).step)
    println((1..10).reversed().first)

}
fun funFiltering(){

    println("------------------filter-------------------------")
    var listData=1..10
    val saveValue=listData.filter {T->T%2==0}
    println(saveValue)
}


fun funDistinct(){
    println("------------------Distinct Values-------------------------")
    val a = listOf(1, 1, 2, 4, 4, 6, 10)
    println(a.distinct())


}

