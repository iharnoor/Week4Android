package com.google.fragmentstest.concepts
object ConceptMutables {

    @JvmStatic
    fun main(args: Array<String>) {

        // Mutable list (ArrayList)
        val mutableList = mutableListOf(1, 2, 3) // size of 3 element
        println(mutableList)
        mutableList[0] = 4  // Modifying an element
        mutableList.add(5)  // Adding an element
        println(mutableList)

// Immutable list (List)
        // val immutableList = listOf(1, 2, 3)
// The following line would not compile since the list is immutable
        // immutableList[0] =5
    }
}