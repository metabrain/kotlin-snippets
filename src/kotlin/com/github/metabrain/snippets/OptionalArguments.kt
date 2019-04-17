package com.github.metabrain.snippets

fun repeat(
        pattern: String, // mandatory
        times: Int, // mandatory
        separator: String = "", // optional, with default
        trimEnds: Boolean = false // optional, with default
) =
        (1..times).fold(initial = pattern) { acc, _ ->
            // Yes, inefficient! Should use StringBuffer or StringBuilder for performance.
            // However, for this didactical purpose, a normal String concatenation looks nicer.
            acc+separator+pattern
        }.let { if(trimEnds) it.trim() else it }


fun main() {
    println(">> No use of optional parameters, so all defaults: '${repeat("A", 3)}'")
    println(">> We can specify any of the optionals, notwithstanding order: '${repeat("  B  ", 4, trimEnds = true)}'")
    println(">> We can specify any of the optionals, notwithstanding order: '${repeat("C", 5, separator = ",")}'")
}