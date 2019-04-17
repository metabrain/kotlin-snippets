package com.github.metabrain.snippets

import kotlin.random.Random

/*
    In Kotlin, 'if' statements from Java got promoted to expressions. An expression is basically a statement that
        returns a value. With this, we can avoid the mental branching required for repeated assignments to the same
        field across several conditional branchs, for example.

    A good side-effect of this is that we can declare the type of the variables straightaway as non-nullable instead of
        initializing as nullable and then assigning inside the branches, which will inform the compiler about the
        effective non-nullability of the value in question.

    It looks nice and is easy to read.
 */

fun main() {
    val v = if(Random.nextBoolean()) {
        "first branch"
    } else {
        "second branch"
    }
    println(">> Value got initialized with the value the branch = $v")
}