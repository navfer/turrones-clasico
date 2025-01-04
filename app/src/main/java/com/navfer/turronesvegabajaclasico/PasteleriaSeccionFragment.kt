package com.navfer.turronesvegabajaclasico

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PasteleriaSeccionFragment : Fragment() {

    companion object {
        fun newInstance(): PasteleriaSeccionFragment {
            return PasteleriaSeccionFragment()
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
        return inflater.inflate(R.layout.fragment_pasteleria_seccion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        // Configuración del RecyclerView
        val sub = Categoria.getSubcategorias("Pasteleria")
        val adaptador = CategoriaAdaptador(sub) { seleccion ->
            when(seleccion.nombre){

                "Mazapanes" -> {
                    Log.d("Info", "Se ha seleccionado mazapanes")
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, PMazapanesFragment.newInstance())
                        .addToBackStack(null)
                        .commit()

                }

                "Polvorones" -> {
                    Log.d("Info", "Se ha seleccionado polvorones")
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, PPolvoronesFragment.newInstance())
                        .addToBackStack(null)
                        .commit()

                }

                "Pasteles" -> {
                    Log.d("Info", "Se ha seleccionado pasteles")
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, PPastelesFragment.newInstance())
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