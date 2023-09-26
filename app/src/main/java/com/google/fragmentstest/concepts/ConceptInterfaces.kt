package com.google.fragmentstest.concepts

object ConceptInterfaces {
    @JvmStatic
    fun main(args: Array<String>) {
        val car = Car(3)
        val aeroplane = Aeroplane(3)

        println(car.move())
        println(aeroplane.fly())
    }
}

interface Vehicle {
    fun move(): Int
    fun fly(): Int {
        return 0
    }
}

class Car(private val position: Int) : Vehicle {
    override fun move(): Int {
        return position + 1
    }
}

class Aeroplane(private val position: Int) : Vehicle {
    override fun move(): Int {
        return position + 1
    }
    override fun fly(): Int {
        return position * 5
    }
}
