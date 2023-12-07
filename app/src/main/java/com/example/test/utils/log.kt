package com.example.test.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale.*

val dateFormat = SimpleDateFormat("HH:mm:ss:SSS", CHINA)

val now = {
    dateFormat.format(Date(System.currentTimeMillis()))
}

fun log(msg: Any?) = println("${now()} [${Thread.currentThread().name}] $msg")