package dev.noroom113.car_management.service

import dev.noroom113.car_management.entity.Car
import dev.noroom113.car_management.entity.CarParameters
import dev.noroom113.car_management.repository.CarParametersRepository
import org.springframework.stereotype.Service

@Service
class CarParametersService(
    private val carParametersRepository: CarParametersRepository
) {
    fun create(car : CarParameters) : CarParameters{
        return carParametersRepository.save(car)
    }

    fun read() : List<CarParameters> {
        return carParametersRepository.findAll()
    }

    fun delete(id: Long) {
        carParametersRepository.deleteById(id)
    }

}
