package dev.noroom113.car_management.entity

import jakarta.persistence.*

@Entity
@Table(name = "cars")
data class Car(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val name: String,
    val model: String,
    val arrivalYear: Int,
    val color: String,
    val price: Double
){
    constructor(name: String, model: String, arrivalYear: Int, color: String, price: Double) : this(0, name, model, arrivalYear, color, price)
}
