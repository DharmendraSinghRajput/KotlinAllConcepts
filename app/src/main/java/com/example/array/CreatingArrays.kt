package com.example.array

/*1=> object that stores multipale value of [same type]
         .fixed  size
      2=> Array have two type
          val num = arrayOf(1, 2, 3, 4)   //implicit type declaration getting value type
          val num = arrayOf<Int>(1, 2, 3) //explicit type declaration
     */

fun main() {

    // declaring an array using arrayOf(),implicit type declaration not type define
    var arr = arrayOf("One", "Two", "Three", "Four", "Five") //,implicit type declaration value type
    for (i in arr)
        println(i)//value print

    for ((i, v) in arr.withIndex())
        println("$i => $v")//value with index print
    println(arr.get(0))


    println("-------------------arrayOf-----------------------------------")
    // declaring explicit type declaration  an array using arrayOf<Int>
    val arrayname2 = arrayOf<Int>(10, 20, 30, 40, 50)
    funPrintArrayValueIndex(arrayname2)
    for (i in 0..arrayname2.size - 1) {
        print(arrayname2[i])
        println("=> $i")

    }
    println("-----------------primitive data types-------------------------------------")
    //built-in factory methods to create arrays of primitive data types
    val arrayname1 = intArrayOf(10, 20, 30, 40)
    arrayname1.forEach {
        println(it)
    }

    println("-----------------Array Value Add 2<-50-------------------------------------")
    arrayname1.set(3, 50)
    funArrInStoreValue(arrayname1)

    println("-----------------Using the Array constructor-------------------------------------")

    val constructorArray = Array(3, { i -> i * 1 })
    for (element in constructorArray) {
        println(element)
    }

    val getSumValue = sumArrayValue(arrayname2)
    println("ArrayValue Sum => ${getSumValue}")

    println("-----------------Using The Array Value Element Exists-------------------------------------")
    arrayCheckExists(arrayOf(1, 2, 3, 4, 5, 6, 4))

    arrayDistinct()
    arrDroppingElement()
    arrayCheckLastThreeValueMaxFind()
}

fun funPrintArrayValueIndex(arr: Array<Int>) {
    println("----------------function value-----------------------------")
    for ((element, v) in arr.withIndex())
        println("$element,$v")

}

fun sumArrayValue(arr: Array<Int>): Int {
    println("----------------Sum List Value Return-----------------------------")
    var sumValue = 0
    for (i in arr) {
        sumValue += i

    }
    return sumValue
}

fun funArrInStoreValue(intArray: IntArray) {
    println("----------------set Value position specific position 3<==50-----------------------------")
    intArray.forEach {

        println(it)
    }

}

//Check if an Element Exists same
fun arrayCheckExists(sameValue: Array<Int>) {
    if (6 in sameValue) {
        println("Value Is Exists ")
    } else {
        println("Value Is Not Exists ")

    }

}

//Distinct Values from Array che
//allows to store duplicate values in an array not print value
fun arrayDistinct() {
    println("=======================Same Value not Print===================")
    val fruits = arrayOf("Apple", "Mango", "Banana", "Orange", "Apple")
    val distinct = fruits.distinct()
    for (item in distinct) {
        println(item)
    }
}

//Dropping Elements from Array
//We can use drop() or dropLast()
// member functions to drop elements from
// the beginning or from the last respectively

fun arrDroppingElement() {
    //drop value beginning and last
    println("=======================Drop value first two value===================")

    val fruits = arrayOf("Apple", "Mango", "Banana", "Orange", "Apple")
    val dropElement = fruits.drop(2)
    val dropLastElement = fruits.dropLast(2)

    dropElement.forEach {
        println(it)
    }
    println("=======================Drop value Last two value===================")

    dropLastElement.forEach {
        println(it)
    }

}


fun arrayCheckLastThreeValueMaxFind() {
    println("=================================Three Three pair value check Max Value=============")
    var arrMaxThreeValue = arrayOf(2, 4, 6, 7, 8, 3, 7, 10, 8)
    arrMaxThreeValue.forEach {

    }

}
