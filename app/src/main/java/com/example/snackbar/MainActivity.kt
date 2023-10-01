package com.example.snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var btnToast:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast = findViewById<Button>(R.id.btnToast)

    }

    fun mostrarToast(vista:View){
        Toast.makeText(this, "Hola desde Toast", Toast.LENGTH_LONG).show()
    }

    fun mostrarSnack(vista:View){
        Snackbar.make(vista, "Hola desde Snack", Snackbar.LENGTH_LONG).setAction("OK"){
            btnToast.text = "Texto cambiado"
        }.setActionTextColor(Color.RED) .show()
    }
}