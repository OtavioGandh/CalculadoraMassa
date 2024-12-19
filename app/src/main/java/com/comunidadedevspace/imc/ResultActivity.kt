package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

            val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)
            val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)
            val tvResult = findViewById<TextView>(R.id.tv_result)

            tvResult.text = result.toString()

            println(" Otavio Resultado "+ result)

            val classificacao : String  = if (result <= 18.5f){
                "Magreza"
            }else if(result > 18.5f && result <=24.8f){
                "Normal"
            }else if (result > 25f && result <=29.9f){
                "Sobrepeso"
            }else if (result > 30 && result <=39.9f){
                "Obesidade"
            }else{
                "Obesidade Grave"
            }

            tvClassificacao.text = classificacao
        }
    }
