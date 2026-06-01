package com.awesomeapp.articleidentity

sealed class State189_28 {
    data object Loading : State189_28()
    data class Success(val data: String) : State189_28()
    data class Error(val message: String) : State189_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}