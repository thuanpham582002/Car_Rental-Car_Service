package dev.noroom113.car_management.config.init

import dev.noroom113.car_management.entity.Car
import dev.noroom113.car_management.entity.CarPackage
import dev.noroom113.car_management.entity.CarParameters
import dev.noroom113.car_management.service.CarPackageService
import dev.noroom113.car_management.service.CarParametersService
import dev.noroom113.car_management.service.CarService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class CarStartupRunner(
    private val carService: CarService,
    private val carPackageService: CarPackageService,
    private val carParametersService: CarParametersService
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        listOf(
            Car(
                licensePlate = "34-S12345",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage(
                    )
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12346",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12347",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12348",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12349",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12350",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12351",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12352",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12353",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            ),
            Car(
                licensePlate = "34-S12354",
                brand = "Toyota",
                model = "Corolla",
                isAvailable = true,
                color = "Black",
                carPackage = carPackageService.create(
                    CarPackage()
                ),
                carParameters = carParametersService.create(
                    CarParameters()
                )
            )
        ).forEach { carService.addCar(it) }

        carService.getAllCars().forEach {
            println(it)
        }
    }
}