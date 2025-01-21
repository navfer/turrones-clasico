package com.navfer.turronesvegabajaclasico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        /**
         * Configuración para que el FloatingActionButton navegue a un nuevo fragmento y nos lleve al carrito.
         * Usamos la acción global para poder navegar al carrito desde cualquier fragmento.
         */
        val botonCarrito: FloatingActionButton = view.findViewById(R.id.botonCarritoCompra)
        botonCarrito.setOnClickListener {
            findNavController().navigate(R.id.action_global_carritoFragment)
        }

        //Configuración del recyclerView
        val categorias = Categoria.getCategorias()
        val adaptador = CategoriaAdaptador(categorias) { seleccion ->

            when(seleccion.nombre){

                //PULSAMOS EN SECCION DE TURRONES
                "Turrones" -> {
                    findNavController().navigate(R.id.action_mainFragment_to_turronesSeccionFragment)
                }

                //PULSAMOS EN SECCION DE PASTELERIA
                "Pasteleria" -> {
                    findNavController().navigate(R.id.action_mainFragment_to_pasteleriaSeccionFragment)
                }

                //PULSAMOS EN SECCION DE PACK Y COMBINADOS
                "Packs" -> {
                    findNavController().navigate(R.id.action_mainFragment_to_combinadosFragment)
                }
            }
        }

        /*
        LinearLayoutManager -> lista vertical
        GridLayoutManager -> cuadrícula
         */
        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adaptador
    }
}