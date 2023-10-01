package com.google.appoftheday.concepts


interface Operation {
    // 2 parameteres and one return type Int
    fun perform(a: Int, b: Int): Int
}

class Multiply : Operation {
    override fun perform(a: Int, b: Int): Int {
        return a * b
    }
}

// callee
fun calculate(op: Operation, a: Int, b: Int): Int {
    // i don't want to handle the multiply functionalte here. i am passing it in the caller
    return op.perform(a, b)
}

val calculate1: (Int, Int) -> Int = { a, b -> a + b }

object ConceptInterface {
    @JvmStatic
    fun main(args: Array<String>) {
        val multiplyObject = Multiply()

//        val returnVal = calculate(multiplyObject, 3,4)
// caller
        val returnVal = calculate(object : Operation {
            override fun perform(a: Int, b: Int): Int {
                return a / b
            }
        }, 3, 4)


        print(returnVal)

//        val result = multiply(2, 3)
//        println("Result: " + result) // Output: Result: 6
    }
}