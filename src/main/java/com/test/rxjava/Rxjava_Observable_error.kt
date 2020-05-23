package com.test.rxjava

import io.reactivex.Observable
import java.util.concurrent.Callable
import java.util.function.Consumer

fun main(args: Array<String>) {

    val myConsumer: Consumer<String> = Consumer { str -> println(str) }
   // throwException()
    throwExceptionUsingCallable()

}

fun throwException() {
    val observable = Observable.error<Exception>(Exception("custom"))
    observable.subscribe(({ println() }), ({ item -> println(" Error 1 :: ${item.hashCode()}") }))
    observable.subscribe(({ println() }), ({ item -> println(" Error 2 :: ${item.hashCode()}") }))
}

private fun throwExceptionUsingCallable() {
    val observable = Observable.error<Exception>(Callable {
        println("New exception created")
        return@Callable Exception("error") })
    observable.subscribe(({ println() }), ({ item -> println(" Error 1 :: ${item.hashCode()}") }))
    observable.subscribe(({ println() }), ({ item -> println(" Error 2 :: ${item.hashCode()}") }))
}