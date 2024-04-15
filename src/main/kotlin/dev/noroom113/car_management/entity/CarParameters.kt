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
}