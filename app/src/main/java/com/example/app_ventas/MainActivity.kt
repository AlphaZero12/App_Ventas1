package com.example.app_ventas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var BotonLogin: Button
    private lateinit var BotonRegistro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        BotonLogin = findViewById(R.id.BotonLogin)
        BotonRegistro = findViewById(R.id.BotonRegistro)

        BotonLogin.setOnClickListener {
            // Abrir la actividad InicioActivity
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }

        BotonRegistro.setOnClickListener {
            // Abrir la actividad de registro
            val intent = Intent(this, ActivityRegistro::class.java)
            startActivity(intent)
            setContentView(R.layout.activity_registro)
        }
    }
}

