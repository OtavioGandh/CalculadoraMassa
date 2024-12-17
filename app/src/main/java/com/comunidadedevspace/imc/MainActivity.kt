package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtPeso = findViewById<TextInputEditText>(R.id.edittext_peso);
        val edtAltura = findViewById<TextInputEditText>(R.id.edittext_altura);
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

            btnCalcular.setOnClickListener{
                val peso: Float = edtPeso.text.toString().toFloat();// esse .text é usado para guardar a informação digitada no peso
                val altura: Float = edtAltura.text.toString().toFloat() // usado para guardar a info da altura

                val alturaQ2 = altura * altura;
                val resultado = peso / alturaQ2;
                println("Rodano o codigo" + resultado)

            }
    }
}