package com.example.mynewtestproject.base

import com.example.mynewtestproject.common.Either
import kotlinx.coroutines.flow.flow
import okio.IOException


abstract class BaseRepositories {

   protected fun <T> doRequest(result: suspend () -> T) = flow {
        try {
            emit(Either.Right(result()))
        } catch (exception: IOException) {
            emit(Either.Left(exception.message.toString()))
        }
    }

}