package com.plcoding.cryptotracker.core.domain.util

enum class NetworkError: Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    SERIALIZATION_ERROR,
    SERVER_ERROR,
    NO_INTERNET_CONNECTION,
    UNKNOWN_ERROR,
}