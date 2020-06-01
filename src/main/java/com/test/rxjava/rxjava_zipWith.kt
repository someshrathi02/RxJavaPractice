package com.test.rxjava

import io.reactivex.Observable
import io.reactivex.functions.BiFunction

fun main(args: Array<String>) {
    var list1 = listOf<String>("1", "2", "3", "4")
    var list2 = listOf<String>("4", "5")

    var combinedObservable = Observable.fromIterable(list1)
            .zipWith(list2, BiFunction { t1:String, t2:String -> t1 to t2 })
    combinedObservable.subscribe { (t1,t2) ->
        println("List 1 element is: ${t1}, List 2 element is ${t2}") }


}