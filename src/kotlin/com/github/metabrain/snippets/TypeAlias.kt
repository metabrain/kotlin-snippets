package com.github.metabrain.snippets

/*
    In some cases, typealias are the superior alternative to data classes. The overhead is much lower since most of the
        data is passed on the stack (if applicable) and does not require another class to be loaded into memory.

    They cannot be hidden in a local scope, so be careful to avoid abstractions leakage which will polute the overall
        namespace of the project.
 */

typealias Body = String
typealias Status = Int
typealias RequestReply = Pair<Body, Status>
fun request(url: String): RequestReply {
    // ..do something with it..
    return RequestReply("this is a body", 200)
}

fun main() {
    val (body, statusCode) = request("qwerty")
    println(">> desconstructed body: $body")
    println(">> desconstructed statusCode: $statusCode")
}