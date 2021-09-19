package io.xorum.namingclash

abstract class Dog {

    fun eat(food: Food) {}

    class Food
}

abstract class Cat {

    fun eat(food: Food) { }

    class Food
}