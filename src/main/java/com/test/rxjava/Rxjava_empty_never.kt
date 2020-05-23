package com.test.rxjava

import io.reactivex.Observable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer

fun main(args: Array<String>) {
   // createObservableUsingEmpty()
    createObservableUsingNever()
}



fun createObservableUsingEmpty() {
    var observable = Observable.empty<String>()
    observable.subscribe(Consumer { result -> println(result) },
            Consumer { error -> println(error) },
            Action { println("Completed") })
}

fun createObservableUsingNever() {

    val observable = Observable.never<String>()
    observable.subscribe(Consumer { result -> println(result) },
            Consumer { error -> println(error) },
            Action { println("Completed") })
}
