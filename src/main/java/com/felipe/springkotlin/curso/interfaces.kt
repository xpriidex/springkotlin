package com.felipe.springkotlin.curso

interface A {
    fun a()
}

abstract class B : A {
    override fun a() {
        println("a")
    }

    abstract fun b()
}

class C: A, B() {
    override fun b() {
        println("B")
    }
}

