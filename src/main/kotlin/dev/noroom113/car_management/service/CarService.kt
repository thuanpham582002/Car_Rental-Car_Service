package dev.noroom113.car_management.service

import dev.noroom113.car_management.entity.Car
import dev.noroom113.car_management.exception.BaseException
import dev.noroom113.car_management.repository.CarRepository
import org.springframework.stereotype.Service

@Service
class CarService(
    private val carRepository: CarRepository
) {
    fun addCar(car: Car) {
        carRepository.save(car)
    }

    fun getAllCars(): List<Car> {
        return carRepository.findAll()
    }

    fun getCarById(id: Long): Car? {
        return carRepository.findById(id).orElseThrow {
            throw BaseException.CarNotFoundException()
        }
    }
}
