package dev.noroom113.car_management

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
class CarManagementApplication

fun main(args: Array<String>) {
    runApplication<CarManagementApplication>(*args)
}
