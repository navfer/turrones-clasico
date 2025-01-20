package com.navfer.turronesvegabajaclasico.carrito

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.navfer.turronesvegabajaclasico.Producto
import com.navfer.turronesvegabajaclasico.R

class CarritoAdaptador(
    private val productos: MutableList<Producto>, // Cambiado a MutableList para actualizaciones dinámicas
    private val Add: (Producto) -> Unit, // Callback para añadir producto
    private val Remove: (Producto) -> Unit, // Callback para quitar producto
    private val Delete: (Producto) -> Unit // Callback para eliminar producto
) : RecyclerView.Adapter<CarritoAdaptador.ViewHolder>() {

    private var posicionSelecionada: Int = -1
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var imagen: ImageView
        var nombre : TextView
        var botonMas: Button
        var botonMenos: Button
        var botonDelete: Button
        var cantidad: TextView

        init {
            imagen = view.findViewById(R.id.imagenProducto)
            nombre = view.findViewById(R.id.nombreProducto)
            botonMas = view.findViewById(R.id.btn_mas)
            botonMenos = view.findViewById(R.id.btn_menos)
            botonDelete = view.findViewById(R.id.btn_eliminar)
            cantidad = view.findViewById(R.id.tv_cantidad)
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_carrito, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.productos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val producto = productos[position]

        holder.nombre.text = producto.nombre
        holder.imagen.setImageResource(producto.imagen)
        holder.cantidad.text = producto.cantidad.toString()

        //Configuracion de los botones
        holder.botonMas.setOnClickListener {
            Add(producto)
            notifyItemChanged(position)
        }

        holder.botonMenos.setOnClickListener {
            Remove(producto)
            if (producto.cantidad == 0) {
                productos.removeAt(position)
                notifyItemRemoved(position)
            } else {
                notifyItemChanged(position)
            }
        }

        holder.botonDelete.setOnClickListener {
            Delete(producto)
            productos.removeAt(position)
            notifyItemRemoved(position)
        }
    }

}