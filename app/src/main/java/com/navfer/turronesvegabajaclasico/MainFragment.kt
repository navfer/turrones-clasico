package com.navfer.turronesvegabajaclasico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


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

        //Configuración del recyclerView
        val categorias = Categoria.getCategorias()
        val adaptador = CategoriaAdaptador(categorias) { seleccion ->

            when(seleccion.nombre){

                //PULSAMOS EN SECCION DE TURRONES
                "Turrones" -> {
                    (activity as? MainActivity)?.cambiarFragmento(TurronesSeccionFragment.newInstance(), "Turrones")
                }

                //PULSAMOS EN SECCION DE PASTELERIA
                "Pasteleria" -> {
                    (activity as? MainActivity)?.cambiarFragmento(PasteleriaSeccionFragment.newInstance(), "Pastelería")

                }

                //PULSAMOS EN SECCION DE PACK Y COMBINADOS
                "Packs" -> {
                    (activity as? MainActivity)?.cambiarFragmento(CombinadosFragment.newInstance(), "Packs y combinados")

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