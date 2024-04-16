package dev.noroom113.car_management.entity.dto

import java.sql.Date

data class CarPackageDto(
    val packageName: String,
    val pricePerHour: Double,
    val created_at: Date,
    val updated_at: Date,
)