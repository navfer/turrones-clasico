package com.navfer.turronesvegabajaclasico

/**
 * La clase Categoria contiene las categorías que contiene la empresa de turrones.
 * Cada categoría contiene su lista de productos y subcategorías en caso de contener.
 */
data class Categoria(
    var nombre: String,
    var imagen: String, //El parámetro es la dirección de la imagen
    var descripcion: String,
    var estado: Boolean,
    val productos: MutableList<Producto> = mutableListOf(),
    val subcategorias: MutableList<Categoria> = mutableListOf()
) {
    init {
        Categoria("Turrones","res/drawable/turron_imagen.jpg","Turrones",true)
        Categoria("Pasteleria","res/drawable/pasteleria_imagen.jpg","Pastelería",true)
        Categoria("Packs","res/drawable/pack_imagen.jpg","Pack combinados",true)
    }

    fun addProducto(producto: Producto) {
        productos.add(producto)
    }

    // Agregar una subcategoría
    fun addSubcategoria(subcategoria: Categoria) {
        subcategorias.add(subcategoria)
    }

}
