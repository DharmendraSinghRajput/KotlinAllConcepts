package com.example.ifelseexpression

fun main() {


    funTwoExePrecision()
    ifElseIfLadder()
}

fun ifElseIfLadder() {
 var age=20

    var result=if (age>19){
        "A"

    }else if(age>10 && 19<age){
        "B"
    }else{
       "C"
    }
    println("Result===> $result")

}

fun funTwoExePrecision() {
    var age = 15

/*    if (age < 18) {
        println("Small Age=> " + age)
    } else {
        println("Greater Age=> " + age)

    }*/

   val result= if (age < 18) {
       "Small Age=> $age"
    } else {
       "Greater Age=> $age"

    }
    println(result)

}
