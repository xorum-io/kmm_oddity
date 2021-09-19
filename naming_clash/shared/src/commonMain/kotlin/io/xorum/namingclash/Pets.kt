package io.xorum.namingclash

interface Dog {

    fun eat(food: DogFood)
}

class DogFood

interface Cat {

    fun eat(food: CatFood)
}

class CatFood