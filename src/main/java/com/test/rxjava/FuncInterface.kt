package com.test.rxjava

 interface FuncInterface {
    // An abstract function
    fun abstractFun(x: Int)

    // A non-abstract (or default) function
    fun normalFun() {
        println("Hello")
    }
}