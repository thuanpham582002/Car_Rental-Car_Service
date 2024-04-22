package dev.noroom113.car_management.jwt.interceptor

import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

interface JwtInterceptor {
    fun intercept(request: HttpServletRequest, response: HttpServletResponse)
}
