package com.nalepa.mateusz.threadpoolslikeasync.demo

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

class ThreadPool2(
    private val executor: Executor,
) {
    fun threadPool2() {
        val asyncCall2 =
            async2 {
                // your code here
            }

        val otherAsyncCall2 =
            async2 {
                // your code here
            }

        val result2 = asyncCall2.blockingAwait()
        val otherResult2 = otherAsyncCall2.blockingAwait()
    }

    private fun <T> async2(
        supplier: () -> T
    ): CompletableFuture<T> =
        CompletableFuture.supplyAsync(supplier, executor)

}
