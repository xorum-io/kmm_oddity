package io.xorum.initorder

data class Order(
    val name: String,
    val dependency: Order?
) {

    init {
        println("Init order$name")
    }
}

val orderA = Order(name = "A", dependency = null)

val orderB = Order(name = "B", dependency = orderA)
