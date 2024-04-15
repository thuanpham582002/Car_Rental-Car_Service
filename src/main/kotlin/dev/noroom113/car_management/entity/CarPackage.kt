package dev.noroom113.car_management.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.sql.Date

@Entity
data class CarPackage(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val packageName: String,
    val pricePerHour: Double,
    val created_at: Date,
    val updated_at: Date,
)
