package com.navfer.turronesvegabajaclasico

data class Producto(
    val nombre: String,
    val descripcion: String,
    val peso: Double, //peso en kg
    val imagen: String, //ruta de la imagen
    var activo: Boolean
) {

}
