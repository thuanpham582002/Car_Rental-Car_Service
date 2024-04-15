package dev.noroom113.car_management.controller

import dev.noroom113.car_management.entity.Car
import dev.noroom113.car_management.service.CarService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/car")
class CarController(
    private val carService: CarService
) {
    @GetMapping("/all")
    fun getAllCars() : ResponseEntity<List<Car>> {
        return ResponseEntity.ok(carService.getAllCars())
    }

    @GetMapping("/add")
    fun addCar(car: Car) {
        carService.addCar(car)
    }


    @GetMapping("/get")
    fun getCarById(id: Long) : ResponseEntity<Car> {
        return ResponseEntity.ok(carService.getCarById(id))
    }


}