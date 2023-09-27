package com.example.app_ventas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InicioActivity : AppCompatActivity() {
    private lateinit var VentaProductos: Button
    private lateinit var ServicioCliente: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        VentaProductos = findViewById(R.id.VentaProductos)
        ServicioCliente = findViewById(R.id.ServicioCliente)

        VentaProductos.setOnClickListener {
            // Abrir la actividad InicioActivity
            val intent = Intent(this, ActivityProductos::class.java)
            startActivity(intent)
        }
        ServicioCliente.setOnClickListener {
            // Abrir la actividad InicioActivity
            val intent = Intent(this, ActivityServiceClient::class.java)
            startActivity(intent)

    }
}}