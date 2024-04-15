package dev.noroom113.car_management.repository

import dev.noroom113.car_management.entity.CarPackage
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarPackageRepository  : JpaRepository<CarPackage, Long> {

}
