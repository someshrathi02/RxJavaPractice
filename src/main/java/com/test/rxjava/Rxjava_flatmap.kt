package com.test.rxjava

import io.reactivex.Observable
import io.reactivex.functions.Function


fun main(args: Array<String>) {
    flatMapExample()
    flatMapBiFunctionExample()

}

fun flatMapBiFunctionExample() {
    val observable = Observable.just("foo", "bar", "jam")
   observable.flatMap(Function { item -> Observable.just("car") },
           io.reactivex.functions.BiFunction { original:String, second:String -> original + "--" + second  })
           .subscribe { item -> println(item ) }
}

fun flatMapExample() {
    val observable = Observable.just("foo", "bar", "jam")
    observable.flatMap { item -> println("Inside flatmap - Received item ${item}")
        Observable.just( item.plus("####"))
    }.subscribe { item -> println("outside flatmap - Received item : ${item}") }
}

