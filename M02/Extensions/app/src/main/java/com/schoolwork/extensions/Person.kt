package com.schoolwork.extensions

class Person(name: String, val age: Int): Named(name)

class Car(name: String, val brand: String): Named(name){
    operator fun plus(car: Car): String{
        return "$name/${car.name}"
    }
}

open class Named(val name: String)