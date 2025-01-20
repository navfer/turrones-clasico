package com.navfer.turronesvegabajaclasico.carrito

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.navfer.turronesvegabajaclasico.Producto

class CarritoViewModel: ViewModel() {
    private var _elementos = MutableLiveData<MutableList<Producto>>()
    val elementos: LiveData<MutableList<Producto>> get() = _elementos


    private val _selectedProducto = MutableLiveData<Producto?>()

    fun addProducto(producto: Producto) {
        val nuevaLista = ArrayList(_elementos.value ?: emptyList())
        val productoExistente = nuevaLista.find { it.nombre == producto.nombre }

        //Si el producto ya se encuentra en la lista incrementa cantidad
        if (productoExistente != null) {
            productoExistente.cantidad ++
        } else {
            nuevaLista.add(producto)
        }

        _elementos.value = nuevaLista
    }


    fun removeProducto(producto: Producto) {
        val nuevaLista = ArrayList(_elementos.value ?: emptyList())
        val productoExistente = nuevaLista.find { it.nombre == producto.nombre }

        if (productoExistente != null) {
            if (productoExistente.cantidad > 1) {
                productoExistente.cantidad --
            }else{
                deleteProducto(producto)
            }

        }
        _elementos.value = nuevaLista
    }

    fun deleteProducto(producto: Producto) {
        val nuevaLista = ArrayList(_elementos.value ?: emptyList())
        nuevaLista.removeIf { it.nombre == producto.nombre }
        _elementos.value = nuevaLista
    }

    fun vaciarLista() {
        val nuevaLista = ArrayList<Producto>()
        _elementos.value = nuevaLista
    }

}