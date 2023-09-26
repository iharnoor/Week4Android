package com.google.fragmentstest.concepts

object ConceptLamda {

    @JvmStatic
    fun main(args: Array<String>) {
        val add: (Int, Int) -> Int = { a, b -> a + b }

        val result = add(5, 7)
        println("Result of adding 5 and 7 is: $result")


        // without lamda
        val adder = Adder()
        val result2 = adder.add(5, 7)
        println("Result of adding 5 and 7 is: $result2")
    }
}
class Adder {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}
