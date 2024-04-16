package dev.noroom113.car_management.entity.dto

data class CarParametersDto(
    val numberOfDoors: Int,
    val numberOfSeats: Int,
    val fuelType: Int,
    val transmissionType: Int,
    val isAirConditioningAvailable: Boolean,
)