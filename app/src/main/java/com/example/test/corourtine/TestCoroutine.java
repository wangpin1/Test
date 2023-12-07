package com.example.test.corourtine;

import kotlin.Unit;

public class TestCoroutine {

    public static void main(String... args) throws Throwable {
        RunSuspend runSuspend = new RunSuspend();
        ContinuationImpl table = new ContinuationImpl(runSuspend);
        table.resumeWith(Unit.INSTANCE);
        runSuspend.await();
    }
}