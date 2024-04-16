package dev.noroom113.car_management.service

import dev.noroom113.car_management.entity.CarPackage
import dev.noroom113.car_management.repository.CarPackageRepository
import org.springframework.stereotype.Service

@Service
class CarPackageService(
    private val carPackageRepository: CarPackageRepository
) {
    fun create(carPackage: CarPackage): CarPackage {
        return carPackageRepository.save(carPackage)
    }

    fun read(): List<CarPackage> {
        return carPackageRepository.findAll()
    }

    fun delete(id: Long) {
        carPackageRepository.deleteById(id)
    }
}
