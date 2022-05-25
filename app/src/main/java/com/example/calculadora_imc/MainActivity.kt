package com.example.calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnImc = this.findViewById<Button>(R.id.btnImc)
        btnImc.setOnClickListener {
            var numPeso = this.findViewById<EditText>(R.id.numPeso)
            var numAltura = this.findViewById<EditText>(R.id.numAltura)
            var peso = numPeso.text.toString().toDouble()
            var altura = numAltura.text.toString().toDouble()
            var imc = peso / (altura * altura)

            if (imc > 40) {
                Toast.makeText(
                    this,
                    "Obesidade Grave",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (imc >= 30 && imc < 40) {
                Toast.makeText(
                    this,
                    "Obesidade",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (imc >= 25 && imc < 29.9) {
                Toast.makeText(
                    this,
                    "Sobrepeso",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (imc >= 18.5 && imc < 24.9) {
                Toast.makeText(
                    this,
                    "Normal",
                    Toast.LENGTH_LONG
                ).show()


            }
        btnImc.text = "Feliz ou triste?"
        }
    }
}