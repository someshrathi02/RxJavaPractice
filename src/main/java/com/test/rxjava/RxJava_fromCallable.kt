package com.test.rxjava

import io.reactivex.Observable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import java.util.concurrent.Callable

fun main(args: Array<String>) {
    val observable = Observable.fromCallable(Callable{getNumbers()})
    observable.subscribe(Consumer { result -> println("On next: ${result}") },
            Consumer { error -> println("Error occured:: ${error}") },
            Action { println("Completed") })
}

fun getNumbers(): Int {
    println("Generating value")
    return 5/0
}
