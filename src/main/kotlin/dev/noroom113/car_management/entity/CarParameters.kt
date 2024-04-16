package dev.noroom113.car_management.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class CarParameters(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val numberOfDoors: Int,
    val numberOfSeats: Int,
    val fuelType: Int,
    val transmissionType: Int,
    val isAirConditioningAvailable: Boolean,
) {
    constructor() : this(
        id = 0,
        numberOfDoors = 0,
        numberOfSeats = 0,
        fuelType = 0,
        transmissionType = 0,
        isAirConditioningAvailable = false,
    )

    constructor(
        numberOfDoors: Int,
        numberOfSeats: Int,
        fuelType: Int,
        transmissionType: Int,
        isAirConditioningAvailable: Boolean,
    ) : this(
        id = 0,
        numberOfDoors = numberOfDoors,
        numberOfSeats = numberOfSeats,
        fuelType = fuelType,
        transmissionType = transmissionType,
        isAirConditioningAvailable = isAirConditioningAvailable,
    )
}