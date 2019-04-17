package com.github.metabrain.snippets

/*
    Allows us to have variables that are are automatically initialized
        when accessed for the first time. The nice thing is that this
        allows the compile to validate that a certain value is always non-null
        if the initializer always returns a non-null value as well.
    As such, in the remained of the code that uses this property will take the
        type of the property as non-null which simplifies a lot of the code
        and allows us to avoid having to always check nullability which
        is extremely error-prone. Use the compiler to think for you!
 */
val lazyVal: String by lazy {
    println("I'm being initialized!")
    "I am Error."
}

fun main() {
    val v: String = lazyVal
    println(">> lazyVal is String = ${v is String}") // Even Intelij tells you this is always true.
    println(">> lazyVal = $v")
}