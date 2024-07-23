package com.gmail.eamosse.tp2

//TODO : Complete the class
data class Student(
    val name: String,
    val code: String,
    val sexe: String,
    val address: String,
    val age: Int
) {
    init {
        require(sexe == "M" || sexe == "F") { "Sexe must be either 'M' or 'F'" }
        require(age > 0) { "Age must be greater than 0" }
    }
}
