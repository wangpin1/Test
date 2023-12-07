package com.example.test.corourtine

import com.example.test.utils.log
import kotlinx.coroutines.delay

suspend fun main() {
    log(1)
    log(returnSuspended())
    log(2)
    delay(1000)
    log(3)
    log(returnImmediately())
    log(4)
}
