package dev.noroom113.car_management.entity.mapped

import dev.noroom113.car_management.entity.CarParameters
import dev.noroom113.car_management.entity.dto.CarParametersDto

fun CarParameters.toDto(): CarParametersDto {
    return CarParametersDto(
        numberOfDoors = this.numberOfDoors,
        numberOfSeats = this.numberOfSeats,
        fuelType = this.fuelType,
        transmissionType = this.transmissionType,
        isAirConditioningAvailable = this.isAirConditioningAvailable,
    )
}

fun CarParametersDto.toEntity(): CarParameters {
    return CarParameters(
        numberOfDoors = this.numberOfDoors,
        numberOfSeats = this.numberOfSeats,
        fuelType = this.fuelType,
        transmissionType = this.transmissionType,
        isAirConditioningAvailable = this.isAirConditioningAvailable,
    )
}