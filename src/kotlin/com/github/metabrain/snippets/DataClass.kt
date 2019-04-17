package com.github.metabrain.snippets

/* Creates a class with some fields, with the relevant Java object-esque
    utility methods defined by the compiler automatically, such as:
    >> nice toString() representation
    >> hashCode() following the the proper contract
    >> getters and setter (if a 'var' and not 'val') for all fields
    >> .copy() method that allows creating a copy with zero-or-more modified fields
*/
data class DataClass(
        val field: String // 'field' is generated with non-nullable type String
)

fun main() {
    val instance = DataClass(
            field = "kotlin"
    )
    println(">> this.toString() = $instance")
    println(">> this.hashCode() = ${instance.hashCode()}")
    println(">> this.field() = ${instance.field}")
    println(">> this.equals(this) = ${instance.equals(instance)}")
    println(">> this.copy(field = 'new field') = ${instance.copy(field = "new field")}")
}
