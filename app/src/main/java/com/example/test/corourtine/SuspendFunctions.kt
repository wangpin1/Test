package com.example.test.corourtine

import kotlin.concurrent.thread
import kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED
import kotlin.coroutines.intrinsics.suspendCoroutineUninterceptedOrReturn
import kotlin.coroutines.resume

suspend fun returnSuspended() = suspendCoroutineUninterceptedOrReturn { continuation ->
    thread {
        Thread.sleep(1000)
        continuation.resume("Return suspended.")
    }
    COROUTINE_SUSPENDED
}

suspend fun returnImmediately() = suspendCoroutineUninterceptedOrReturn<String> {
    "Return immediately."
}