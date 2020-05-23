package com.test.rxjava

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

fun main(args: Array<String>) {
   val observable =  Observable.just(1,2,3,4 )

    val observer:Observer<Int> = MyObserver()
    observable.subscribe(observer)
}

class MyObserver:Observer<Int> {
    override fun onComplete() {
        println("Inside onComplete ")
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onNext(t: Int) {
        println(t)
    }

    override fun onError(e: Throwable) {
        println("Inside onError:: error is :: ${e.localizedMessage} ")

    }

}
