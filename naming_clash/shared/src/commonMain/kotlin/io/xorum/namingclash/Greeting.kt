package io.xorum.namingclash

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}