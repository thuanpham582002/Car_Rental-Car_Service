package dev.noroom113.car_management.entity

import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name = "cars")
data class Car(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val licensePlate: String,
    val brand: String,
    val model: String,
    val isAvailable: Boolean,
    val color: String,
    @ManyToOne
    val carPackage: CarPackage?,
    @OneToOne
    val carParameters: CarParameters?,
    val created_at: Date,
    val updated_at: Date,
){
    constructor() : this(
        id = 0,
        licensePlate = "",
        brand = "",
        model = "",
        isAvailable = false,
        color = "",
        carPackage = null,
        carParameters = null,
        created_at = Date(System.currentTimeMillis()),
        updated_at = Date(System.currentTimeMillis())
    )

    constructor(
        licensePlate: String,
        brand: String,
        model: String,
        isAvailable: Boolean,
        color: String,
        carPackage: CarPackage?,
        carParameters: CarParameters?,
        created_at: Date? = null,
        updated_at: Date? = null
    ) : this(
        id = 0,
        licensePlate = licensePlate,
        brand = brand,
        model = model,
        isAvailable = isAvailable,
        color = color,
        carPackage = carPackage,
        carParameters = carParameters,
        created_at = created_at ?: Date(System.currentTimeMillis()),
        updated_at = updated_at ?: Date(System.currentTimeMillis())
    )
}