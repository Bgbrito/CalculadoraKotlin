package com.example.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    class MainActivity : AppCompatActivity() {

        private lateinit var txtValor1: EditText
        private lateinit var txtValor2: EditText

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            txtValor1 = findViewById(R.id.txtPrimerValor)
            txtValor2 = findViewById(R.id.txtSegundoValor)

            val btnSumar = findViewById<Button>(R.id.btnSumar)
            btnSumar.setOnClickListener(this::onClick)

            val btnRestar = findViewById<Button>(R.id.btnRestar)
            btnRestar.setOnClickListener(this::onClick)

            val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
            btnMultiplicar.setOnClickListener(this::onClick)

            val btnDividir = findViewById<Button>(R.id.btnDividir)
            btnDividir.setOnClickListener(this::onClick)

        }

        fun sumar(a: Int, b: Int): Int {
            return a + b
        }

        fun restar(a: Int, b: Int): Int {
            return a - b
        }

        fun multiplicar(a: Int, b: Int): Int {
            return a * b
        }

        fun dividir(a: Int, b: Int): Int {
            return a / b
        }

        fun onClick(v: View?) {
            when (v?.id) {
                R.id.btnSumar -> {
                    try{
                    }catch (ex: Exception){
                        Log.e("Ocurrio un error al sumar",ex.toString())
                    }

                    var resultado = sumar(
                        txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt()
                    )
                    Toast.makeText(
                        applicationContext, "El resultado de la suma es: $resultado", Toast.LENGTH_LONG
                    ).show()
                }

                R.id.btnRestar -> {
                    try{
                    }catch (ex: Exception){
                        Log.e("Ocurrio un error al restar",ex.toString())
                    }
                    var resultado = restar(
                        txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt()
                    )
                    Toast.makeText(
                        applicationContext, "El resultado de la resta es: $resultado", Toast.LENGTH_LONG
                    ).show()
                }

                R.id.btnMultiplicar -> {
                    try{
                    }catch (ex: Exception){
                        Log.e("Ocurrio un error al Multiplicar",ex.toString())
                    }
                    var resultado = multiplicar(
                        txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt()
                    )
                    Toast.makeText(
                        applicationContext, "El resultado de la multiplicación es: $resultado", Toast.LENGTH_LONG
                    ).show()
                }

                R.id.btnDividir -> {
                    try{
                    }catch (ex: Exception){
                        Log.e("Ocurrio un error al Dividir",ex.toString())
                    }
                    var resultado = dividir(
                        txtValor1.text.toString().toInt(), txtValor2.text.toString().toInt()
                    )
                    Toast.makeText(
                        applicationContext, "El resultado de la división es: $resultado", Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }



}