package com.test.rxjava

import io.reactivex.Observable

fun main(args: Array<String>) {
    mapAndFilterOperator()
}

fun mapAndFilterOperator() {
    Observable.just(1, 2,3,4,5)
            .filter { item -> item %2 == 0 }
            .map { item -> item*2 }
            .subscribe {  item -> println(item) }
}
