package com.navfer.turronesvegabajaclasico

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
    }
}