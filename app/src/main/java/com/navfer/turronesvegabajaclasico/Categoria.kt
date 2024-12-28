package com.navfer.turronesvegabajaclasico

/**
 * La clase Categoria contiene las categorías que contiene la empresa de turrones.
 * Cada categoría contiene su lista de productos y subcategorías en caso de contener.
 */
data class Categoria(
    var nombre: String,
    var imagen: Int,
    var descripcion: String,
    var estado: Boolean,
    val productos: MutableList<Producto> = mutableListOf(),
    val subcategorias: MutableList<Categoria> = mutableListOf()
) {
    companion object {
        val listaCategorias = mutableListOf<Categoria>()

        init {
            listaCategorias.add(Categoria("Turrones", R.drawable.turron_imagen, "Turrones de todas las clases.", true))
            listaCategorias.add(Categoria("Pasteleria", R.drawable.pasteleria_imagen, "Nuestra sección de pastelería con todo lo necesario para estas fiestas.", true))
            listaCategorias.add(Categoria("Packs", R.drawable.pack_imagen, "Nuestros pack combinados, las mejores selecciones para todos los gustos.", true))
        }

        fun getCategorias(): List<Categoria> = listaCategorias
    }

    fun addProducto(producto: Producto) {
        productos.add(producto)
    }

    // Agregar una subcategoría
    fun addSubcategoria(subcategoria: Categoria) {
        subcategorias.add(subcategoria)
    }
}
