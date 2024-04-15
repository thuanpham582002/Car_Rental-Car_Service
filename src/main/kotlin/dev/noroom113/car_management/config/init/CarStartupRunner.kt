package dev.noroom113.car_management.config.init

import dev.noroom113.car_management.entity.Car
import dev.noroom113.car_management.service.CarService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class CarStartupRunner(
    private val carService: CarService
) : CommandLineRunner {
    override fun run(vararg args: String?) {
    }
}