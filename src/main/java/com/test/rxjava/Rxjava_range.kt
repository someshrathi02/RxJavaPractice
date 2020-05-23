package com.test.rxjava

import io.reactivex.Observable

fun main(args: Array<String>) {
    createObservableUsingRange()
}

fun createObservableUsingRange() {
    val start = 5
    val count =2
    val observable =Observable.range(start, count)
    observable.subscribe { result -> println(result) }
}
