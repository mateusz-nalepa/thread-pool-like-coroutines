package com.nalepa.mateusz.threadpoolslikeasync.demo

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

class ThreadPool_3(
    private val executor: Executor,
): Executor by executor {

    fun threadPool3() {
        val asyncCall3 =
            async3 {
                // your code here
            }

        val otherAsyncCall3 =
            async3 {
                // your code here
            }

        val result3 = asyncCall3.blockingAwait()
        val otherResult2 = otherAsyncCall3.blockingAwait()
    }

}

private fun <T> Executor.async3(
    supplier: () -> T
): CompletableFuture<T> =
    CompletableFuture.supplyAsync(supplier, this)
