package com.navfer.turronesvegabajaclasico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.navfer.turronesvegabajaclasico.carrito.CarritoViewModel

class PedidoFragment : Fragment() {
    private val viewModel: CarritoViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pedido, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nombre: EditText = view.findViewById(R.id.et_nombre)
        val telefono: EditText = view.findViewById(R.id.et_telefono)
        val fecha: EditText = view.findViewById(R.id.editTextDate)

        val estado: TextView = view.findViewById(R.id.tv_estadoPedido)
        val detalles: TextView = view.findViewById(R.id.tv_detallesPedido)
        val mensajeError: TextView = view.findViewById(R.id.mensajeError)


        estado.setText("Pendiente pagar.")
        detalles.setText(viewModel.elementos.value.toString())


        val botonCofirmar: Button = view.findViewById(R.id.btn_confirmarPedido)
        botonCofirmar.setOnClickListener{
            if(true){
                viewModel.vaciarLista()
                //navegacion a la pantalla de inicio
                findNavController().navigate(R.id.action_pedidoFragment_to_mainFragment, null,
                    NavOptions.Builder().setPopUpTo(R.id.mainFragment, true).build())

            }else{
                mensajeError.setText("ERROR: Campos incompletos.")
            }
        }

    }
}