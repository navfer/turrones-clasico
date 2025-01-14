package com.navfer.turronesvegabajaclasico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class TurronesSeccionFragment : Fragment() {
    companion object {
        fun newInstance(): TurronesSeccionFragment {
            return TurronesSeccionFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_turrones_seccion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        // Configuración del RecyclerView
        val sub = Categoria.getSubcategorias("Turrones")
        val adaptador = CategoriaAdaptador(sub) { seleccion ->

            when(seleccion.nombre){

                "Alicante" -> {
                    findNavController().navigate(R.id.action_turronesSeccionFragment_to_TAlicanteFragment)

                }

                "Jijona" -> {

                    findNavController().navigate(R.id.action_turronesSeccionFragment_to_TJijonaFragment)

                }

                "Guirlache" ->{
                    findNavController().navigate(R.id.action_turronesSeccionFragment_to_TGuirlacheFragment)

                }

                "Mazapan" -> {
                    findNavController().navigate(R.id.action_turronesSeccionFragment_to_TMazapanFragment)

                }

                "Cacahuete" -> {
                    findNavController().navigate(R.id.action_turronesSeccionFragment_to_TCacahueteFragment)

                }

                "A la piedra" -> {
                    findNavController().navigate(R.id.action_turronesSeccionFragment_to_TPiedraFragment)

                }
            }
        }

        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adaptador
    }

}