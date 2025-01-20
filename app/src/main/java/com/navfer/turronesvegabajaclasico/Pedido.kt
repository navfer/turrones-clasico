package com.navfer.turronesvegabajaclasico

enum class Estados {
    PENDIENTE_PREPARAR,
    PREPARADO,
    ENVIADO,
    ENTREGADO
}

data class Pedido(
    val nombre: String,
    val telefono: String,
    val fecha: String,
    var estado: Estados = Estados.PENDIENTE_PREPARAR,
    val lineas: MutableList<Producto> = mutableListOf()
)

