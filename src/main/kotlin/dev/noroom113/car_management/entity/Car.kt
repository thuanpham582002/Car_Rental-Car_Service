package dev.noroom113.car_management.entity

data class Car(
    val id: Long,
    val name: String,
    val model: String,
    val year: Int,
    val color: String,
    val price: Double
)
