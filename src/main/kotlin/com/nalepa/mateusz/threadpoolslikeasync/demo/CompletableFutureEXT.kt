package com.nalepa.mateusz.threadpoolslikeasync.demo

import java.util.concurrent.CompletableFuture

fun <T> CompletableFuture<T>.blockingAwait(): T =
    this.join()