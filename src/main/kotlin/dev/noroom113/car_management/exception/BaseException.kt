package dev.noroom113.car_management.exception

sealed class BaseException(
    val code: Int,
    override val message: String
) : RuntimeException(message){
    class CarNotFoundException : BaseException(2001, "Car not found")
}