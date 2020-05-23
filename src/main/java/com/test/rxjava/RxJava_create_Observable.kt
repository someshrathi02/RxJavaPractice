package com.test.rxjava

import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe

fun main(args: Array<String>) {


    //createObservableFromJust()

   // createObservableFromIterable()
    createObservableFromCreate()
}

private fun createObservableFromIterable() {
    val listOfInt = listOf<Int>(1, 2, 3, 4, 5)
    val observableFromIterable = Observable.fromIterable(listOfInt)
    observableFromIterable.subscribe { item -> System.out.println(item)  }
}

private fun createObservableFromJust() {
    Observable.just(1, 2, 3, 4, 5)
            .subscribe { item -> System.out.println(item) }
}

private fun createObservableFromCreate() {
    val complete = {System.out.println("")}
    Observable.create(ObservableOnSubscribe<Int>
    { emitter ->
        emitter.onNext(1)
        emitter.onNext(2)
        emitter.onNext(3)
        emitter.onNext(4/0)
        emitter.onComplete()

    }
    ).subscribe ({ item -> System.out.println(item) },
            {error -> System.out.println("There was an error:: $error")},
            { System.out.println("Completed") })

}