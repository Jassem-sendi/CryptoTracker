package com.plcoding.cryptotracker.core.data.networking


import android.R.attr.level
import com.plcoding.cryptotracker.BuildConfig
import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

object HttpClientFactory {
    fun create(engin: HttpClientEngine): HttpClient {
        return HttpClient(engin) {
            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.HEADERS
            }
            install(ContentNegotiation) {
                json(
                    json = Json{
                        ignoreUnknownKeys = true
                        isLenient = true
                        prettyPrint = true
                    }
                )
            }
            defaultRequest {
                contentType(ContentType.Application.Json)
                header("Authorization", "Bearer ${BuildConfig.API_KEY}")
            }
        }
    }
}