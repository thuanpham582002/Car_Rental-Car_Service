package dev.noroom113.car_management.entity.mapped

import dev.noroom113.car_management.entity.Car
import dev.noroom113.car_management.entity.dto.CarDto

fun Car.toDto(): CarDto {
    return CarDto(
        licesePlate = this.licensePlate,
        brand = this.brand,
        model = this.model,
        isAvailable = this.isAvailable,
        color = this.color,
        carPackageDto = this.carPackage?.toDto(),
        carParametersDto = this.carParameters?.toDto(),
        created_at = this.created_at,
        updated_at = this.updated_at,
    )
}

fun CarDto.toEntity(): Car {
    return Car(
        0,
        licensePlate = this.licesePlate,
        brand = this.brand,
        model = this.model,
        isAvailable = this.isAvailable,
        color = this.color,
        carPackage = this.carPackageDto?.toEntity(),
        carParameters = this.carParametersDto?.toEntity(),
        created_at = this.created_at,
        updated_at = this.updated_at,
    )
}