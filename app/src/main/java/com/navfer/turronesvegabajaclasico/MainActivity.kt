package com.navfer.turronesvegabajaclasico

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    //private val viewModel: MedidaViewModel by viewModels()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)


        //Fragmento Main
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, MainFragment())
            .commit()
        toolbar.setTitle("Turrones VegaBaja")
        setSupportActionBar(toolbar)

        /**
         * Configuración para que el FloatingActionButton navegue a un nuevo fragmento y nos lleve al carrito
         */
        val botonCarrito: FloatingActionButton = findViewById(R.id.botonCarritoCompra)
        botonCarrito.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, CarritoFragment())
                .addToBackStack(null)
                .commit()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
            supportActionBar?.setDisplayHomeAsUpEnabled(false)
            val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
            toolbar.setTitle("Turrones VegaBaja")
            return true
        }
        return super.onSupportNavigateUp()
    }

    /**
     * La función recibe como parámetros el fragmentos al que se cambiará y el título del toolbar para el nuevo fragmento
     */
    fun cambiarFragmento(fragment: Fragment, titulo: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .addToBackStack(null)
            .commit()

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        toolbar.setTitle(titulo)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}