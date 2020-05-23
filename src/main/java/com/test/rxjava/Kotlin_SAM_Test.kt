package com.test.rxjava

import java.util.function.Consumer

internal object Kotlin_SAM_Test {
    @JvmStatic
    fun main(args: Array<String>) {

        val myConsumer: Consumer<String> = Consumer{ t -> println(t) }
        myConsumer.accept("xsgsg")
        val fobj = object :FuncInterface{
            override fun abstractFun(x: Int) {
                println(x)
            }

        }

        // This calls above lambda expression and prints 5.
        fobj.abstractFun(5)

        val impl: (String, String) -> Unit = { a,b -> println("${a}, ${b}")}
        impl.invoke("x","y")

    }




}