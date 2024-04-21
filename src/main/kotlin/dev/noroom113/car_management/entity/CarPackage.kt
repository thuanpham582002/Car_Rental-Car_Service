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
) {
    constructor() : this(
        id = 0,
        packageName = "",
        pricePerHour = 0.0,
        created_at = Date(System.currentTimeMillis()),
        updated_at = Date(System.currentTimeMillis()),
    )

    constructor(
        packageName: String,
        pricePerHour: Double,
    ) : this(
        id = 0,
        packageName = packageName,
        pricePerHour = pricePerHour,
        created_at = Date(System.currentTimeMillis()),
        updated_at = Date(System.currentTimeMillis()),
    )

    constructor(
        packageName: String,
        pricePerHour: Double,
        created_at: Date,
        updated_at: Date,
    ) : this(
        id = 0,
        packageName = packageName,
        pricePerHour = pricePerHour,
        created_at = created_at,
        updated_at = updated_at,
    )
}
