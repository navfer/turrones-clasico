package com.navfer.turronesvegabajaclasico.carrito

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.navfer.turronesvegabajaclasico.Producto
import com.navfer.turronesvegabajaclasico.R

class CarritoFragment : Fragment() {
    private val viewModel: CarritoViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_carrito, container, false)
    }

    companion object {
        fun newInstance(): CarritoFragment {
            return CarritoFragment()
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        //val productos = viewModel.elementos.value
        val adaptador = CarritoAdaptador(
            productos = viewModel.elementos.value ?: mutableListOf(),
            Add = { producto -> viewModel.addProducto(producto) },
            Remove = { producto -> viewModel.removeProducto(producto) },
            Delete = { producto -> viewModel.deleteProducto(producto) }
        )

        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adaptador



        val botonPedido: Button = view.findViewById(R.id.btn_pedido)
        if (viewModel.elementos.value == null || viewModel.elementos.value == emptyList<Producto>()) {
            botonPedido.visibility = View.GONE
        }
        botonPedido.setOnClickListener{
            findNavController().navigate(R.id.action_carritoFragment_to_pedidoFragment)
        }

    }
}
