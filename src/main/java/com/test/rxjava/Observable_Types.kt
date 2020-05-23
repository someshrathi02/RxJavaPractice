package com.test.rxjava

import io.reactivex.Observable

fun main(args: Array<String>) {
    //coldObservables()
    connectableObservables()

}

fun connectableObservables() {
    val observable = Observable.just(1, 2, 3, 4, 5).publish()
    observable.subscribe { item -> System.out.println("Observer 1 : ${item}") }
    observable.subscribe { item -> System.out.println("Observer 2 : ${item}") }

    observable.connect()
    observable.subscribe { item -> System.out.println("Observer 3 : ${item}") }


}

private fun coldObservables() {
    val observable = Observable.just(1, 2, 3, 4, 5)
    observable.subscribe { item -> System.out.println("Observer 1 : ${item}") }
    Thread.sleep(3000)
    observable.subscribe { item -> System.out.println("Observer 2 : ${item}") }
}