package io.xorum.initorder

data class Order(
    val name: String,
    val dependency: Order?
) {

    init {
        println("Init order$name")
    }
}
