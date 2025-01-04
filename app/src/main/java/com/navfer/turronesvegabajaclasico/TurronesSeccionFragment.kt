package com.navfer.turronesvegabajaclasico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, TAlicanteFragment.newInstance())
                        .addToBackStack(null)
                        .commit()
                }

                "Jijona" -> {

                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, TJijonaFragment.newInstance())
                        .addToBackStack(null)
                        .commit()
                }

                "Guirlache" ->{
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, TGuirlacheFragment.newInstance())
                        .addToBackStack(null)
                        .commit()
                }

                "Mazapan" -> {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, TMazapanFragment.newInstance())
                        .addToBackStack(null)
                        .commit()
                }

                "Cacahuete" -> {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, TCacahueteFragment.newInstance())
                        .addToBackStack(null)
                        .commit()
                }

                "A la piedra" -> {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, TPiedraFragment.newInstance())
                        .addToBackStack(null)
                        .commit()
                }
            }
        }

        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adaptador
    }

}