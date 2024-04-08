package dev.noroom113.car_management.controller

import dev.noroom113.car_management.service.CarService
import org.springframework.web.bind.annotation.RestController

@RestController
class CarController(
    private val carService: CarService
) {
}