package com.android.example.studentapp

data class Student(
    val id: String = "",
    val name: String = "",
    val program: String = "",
    val phones: List<String> = emptyList()
)
