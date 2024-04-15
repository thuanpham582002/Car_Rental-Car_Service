package dev.noroom113.car_management.entity

import jakarta.persistence.*
import java.sql.Date

@Entity
@Table(name = "cars")
data class Car(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val licesePlate: String,
    val brand: String,
    val model: String,
    val isAvailable: Boolean,
    val color: String,
    val created_at: Date,
    val updated_at: Date,
)