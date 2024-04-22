package dev.noroom113.car_management.entity

import java.io.Serializable

data class UrlAccessable(
    val method: Set<HttpMethod>,
    val uri: String,
) : Serializable

enum class HttpMethod {
    GET, POST, PUT, DELETE, ALL
}
