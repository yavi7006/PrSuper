package com.pmdm.ud1pr001k.sesiones

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.pmdm.ud1pr001k.Principal
import com.pmdm.ud1pr001k.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    fun lanzarRegistro(view : View) {
        val intent = Intent(this,Registro::class.java)
        startActivity(intent)
    }

    fun lanzarRecuperar(view : View) {
        val intent = Intent(this,Recuperar::class.java)
        startActivity(intent)
    }

    fun comprobarSesion(view: View){
        val datos = arrayOf("correo@gmail.com","Password")
        val correo = findViewById<EditText>(R.id.correo)
        if(correo.text.contains('@')){
            if(correo.text.equals(datos[0])){
                val contr = findViewById<EditText>(R.id.contrasena)
                if(contr.text.length>7){
                    if(contr.text.equals(datos[1])){
                        val intent = Intent(this,Principal::class.java)
                        startActivity(intent)
                    }
                }
            }
        }
    }
}