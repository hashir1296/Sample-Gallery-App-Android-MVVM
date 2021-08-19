package com.airlift.android.network

import com.airlift.android.util.Status


data class Resource<out T>(
    val status: Status,
    val data: T?,
    val message: String?,
    val responseCode: Int
) {
    companion object {
        fun <T> success(data: T?, responseCode: Int): Resource<T> {
            return Resource(
                Status.SUCCESS,
                data,
                null,
                responseCode
            )
        }

        fun <T> error(msg: String, data: T?, responseCode: Int): Resource<T> {
            return Resource(
                Status.ERROR,
                data,
                msg,
                responseCode
            )
        }

        fun <T> noInternetConnection(msg: String, data: T?, responseCode: Int): Resource<T> {
            return Resource(
                Status.NO_INTERNET_CONNECTION,
                data,
                msg,
                responseCode
            )
        }

        fun <T> loading(data: T?, responseCode: Int): Resource<T> {
            return Resource(
                Status.LOADING,
                data,
                null,
                responseCode
            )
        }
    }
}
