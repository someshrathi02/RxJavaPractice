package com.test.rxjava

import io.reactivex.Observable

fun main(args: Array<String>) {
    createObservableUsingDefer()
}

fun createObservableUsingDefer() {
    val start = 5
    var count =2
    val observable = Observable.defer({
        println("New observable created with start : ${start} and count : ${count}")
        Observable.range(start, count)
    })
    observable.subscribe { result -> println("Observer 1 : ${result}") }
    count = 3
    observable.subscribe { result -> println("Observer 2 : ${result}") }

}
