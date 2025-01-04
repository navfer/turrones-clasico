package com.navfer.turronesvegabajaclasico

data class Producto(
    val nombre: String,
    val descripcion: String,
    val peso: Double,
    val imagen: Int,
    var activo: Boolean
) {

}
