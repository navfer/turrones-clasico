package com.navfer.turronesvegabajaclasico

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductoAdaptador(private val productos: List<Producto>, private val AddClick: (Producto) -> Unit): RecyclerView.Adapter<ProductoAdaptador.ViewHolder>() {

    private var posicionSelecionada: Int = -1
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var imagen: ImageView
        var nombre : TextView
        var descripcion: TextView
        var peso: TextView
        var botonAdd: Button


        init {
            imagen = view.findViewById(R.id.imagenProducto)
            nombre = view.findViewById(R.id.nombreProducto)
            descripcion = view.findViewById(R.id.descripcionProducto)
            peso = view.findViewById(R.id.pesoProducto)
            botonAdd = view.findViewById(R.id.btn_add)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_producto, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.productos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val producto = productos[position]

        holder.nombre.text = producto.nombre
        holder.descripcion.text = producto.descripcion
        holder.imagen.setImageResource(producto.imagen)
        holder.peso.text = producto.peso.toString() + " kg."

        //añade al carrito
        holder.botonAdd.setOnClickListener {
            AddClick(producto)
        }
    }
}