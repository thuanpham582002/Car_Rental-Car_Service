package dev.noroom113.car_management.service

import dev.noroom113.car_management.repository.CarRepository
import org.springframework.stereotype.Service

@Service
class CarService(
    private val carRepository: CarRepository
) {

}
