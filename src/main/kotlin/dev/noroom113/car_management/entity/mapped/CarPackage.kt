package dev.noroom113.car_management.entity.mapped

import dev.noroom113.car_management.entity.CarPackage
import dev.noroom113.car_management.entity.dto.CarPackageDto

fun CarPackage.toDto(): CarPackageDto {
    return CarPackageDto(
        packageName = packageName,
        pricePerHour = pricePerHour,
        created_at = this.created_at,
        updated_at = this.updated_at,
    )
}

fun CarPackageDto.toEntity(): CarPackage {
    return CarPackage(
        packageName = packageName,
        pricePerHour = pricePerHour,
        created_at = this.created_at,
        updated_at = this.updated_at,
    )
}