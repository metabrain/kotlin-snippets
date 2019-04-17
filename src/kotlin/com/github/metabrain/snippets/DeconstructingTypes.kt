package com.github.metabrain.snippets

/*
    Deconstructing does not work as a basis from the language itself, but at compiler level since it will generate methods
        called componentN() in which N is a number from 1 until the total number of fields in the class.

    This allows us to use the deconstructor operator since it will access the instance of the class starting from component1()
        all the way until the last field N in componentN().

    They can also be used in lambdas when fed with an instance of a class/typealias which has these components.

    TODO: Not sure if this works with classes compiled from Java..? Even if they are compiled by the Kotlin compiler..?
 */

typealias Tuple<A, B> = Pair<A, B>
data class TupleClass<out A,out B>(val a: A, val b: B)

fun main() {
    run {
        val (first, second) = Tuple("aaa", 13)
        println(">> desconstructed Tuple typealias - [first:$first second:$second]")
    }
    run {
        val (first, second) = TupleClass("bbb", 49)
        println(">> desconstructed Tuple data class - [first:$first second:$second]")
    }
    run {
        TupleClass("ccc", 79).let { (first, second) ->
            println(">> desconstructed Tuple in let expression - [first:$first second:$second]")
        }
    }
}