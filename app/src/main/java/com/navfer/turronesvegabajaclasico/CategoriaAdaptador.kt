package com.navfer.turronesvegabajaclasico

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.function.Consumer

class CategoriaAdaptador(
    private val categorias: List<Categoria>,
    private val onClick: (Categoria) -> Unit
) : RecyclerView.Adapter<CategoriaAdaptador.ViewHolder>() {

    private var posicionSelecionada: Int = -1
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var imagen: ImageView
        var nombre : TextView
        var descripcion: TextView

        init {
            imagen = view.findViewById(R.id.imagenCategoria)
            nombre = view.findViewById(R.id.nombreCategoria)
            descripcion = view.findViewById(R.id.descripcionCategoria)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_categoria, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.categorias.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categoria = categorias[position]

        holder.nombre.text = categoria.nombre
        holder.descripcion.text = categoria.descripcion
        holder.imagen.setImageResource(categoria.imagen)
        //Maneja que se haga click en la categoria
        holder.itemView.setOnClickListener { onClick(categoria) }
    }

}
