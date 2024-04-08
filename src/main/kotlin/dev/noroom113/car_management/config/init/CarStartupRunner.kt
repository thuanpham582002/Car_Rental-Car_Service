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
        carService.addCar(Car("Toyota", "Corolla", 2015, "White", 10000.0))
        carService.addCar(Car("Toyota", "Camry", 2016, "Black", 15000.0))
        carService.addCar(Car("Honda", "Civic", 2017, "Red", 20000.0))
        carService.addCar(Car("Honda", "Accord", 2018, "Blue", 25000.0))
        carService.addCar(Car("Nissan", "Sentra", 2019, "Green", 30000.0))
    }
}