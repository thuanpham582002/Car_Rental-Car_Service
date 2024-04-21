package dev.noroom113.car_management.entity



import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import java.sql.Date

@Entity
@Table
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
    @JoinColumn(name = "carParameters_id")
    @Cascade(CascadeType.ALL)
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