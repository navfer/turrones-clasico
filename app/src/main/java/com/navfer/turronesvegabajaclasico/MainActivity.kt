package com.navfer.turronesvegabajaclasico

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    //private val viewModel: MedidaViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController
        //vinculacion del navController con el toolbar para mostrar botón backTo <-
        NavigationUI.setupWithNavController(toolbar, navController)


        /**
         * Configuración para que el FloatingActionButton navegue a un nuevo fragmento y nos lleve al carrito
         */
        val botonCarrito: FloatingActionButton = findViewById(R.id.botonCarritoCompra)
        botonCarrito.setOnClickListener {
            findNavController(R.id.navHostFragment).navigate(R.id.action_global_carritoFragment)
        }


    }
}