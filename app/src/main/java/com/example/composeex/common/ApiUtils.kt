package com.example.composeex.common

/**
 * Wrapper class
 * Contain the actual data and error message from apis
 */
sealed class ApiUtils<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : ApiUtils<T>(data)
    class Error<T>(message: String, data: T? = null) : ApiUtils<T>(data, message)
    class Loading<T>(data: T? = null) : ApiUtils<T>(data)
}