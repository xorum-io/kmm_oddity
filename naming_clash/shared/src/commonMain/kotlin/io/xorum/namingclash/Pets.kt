package io.xorum.namingclash

interface Dog {

    fun eat(food: DogFood)
}

class DogFood

interface Cat {

    fun eat(food: CatFood)
}

data class CatFood(
    val isSneaky: Boolean
)