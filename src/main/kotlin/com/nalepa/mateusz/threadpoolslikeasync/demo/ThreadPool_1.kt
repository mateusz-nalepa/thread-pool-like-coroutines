package com.nalepa.mateusz.threadpoolslikeasync.demo

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

fun threadPool1(executor: Executor) {
    val asyncCall1 =
        async1(executor) {
            // your code here
        }

    val otherAsyncCall1 =
        async1(executor) {
            // your code here
        }

    val result1 = asyncCall1.blockingAwait()
    val otherResult1 = otherAsyncCall1.blockingAwait()
}


private fun <T> async1(
    executor: Executor,
    supplier: () -> T
): CompletableFuture<T> =
    CompletableFuture.supplyAsync(supplier, executor)


