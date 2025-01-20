package com.navfer.turronesvegabajaclasico.turrones

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.navfer.turronesvegabajaclasico.Categoria
import com.navfer.turronesvegabajaclasico.ProductoAdaptador
import com.navfer.turronesvegabajaclasico.R
import com.navfer.turronesvegabajaclasico.carrito.CarritoViewModel

class TGuirlacheFragment : Fragment() {
    private val viewModel: CarritoViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_t_guirlache, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        //confi recyclerView
        val productos = Categoria.getProductos("Guirlache")
        val adaptador = ProductoAdaptador(productos) { producto ->
            viewModel.addProducto(producto)
        }
        Log.d("Info", "$productos")


        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adaptador
    }

    companion object {
        fun newInstance(): TGuirlacheFragment {
            return TGuirlacheFragment()
        }
    }
}

