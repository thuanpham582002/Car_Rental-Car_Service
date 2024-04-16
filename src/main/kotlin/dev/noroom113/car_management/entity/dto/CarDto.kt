package dev.noroom113.car_management.entity.dto

import java.sql.Date

class CarDto(
    val licesePlate: String,
    val brand: String,
    val model: String,
    val isAvailable: Boolean,
    val color: String,
    val carPackageDto: CarPackageDto?,
    val carParametersDto: CarParametersDto?,
    val created_at: Date,
    val updated_at: Date,
)
