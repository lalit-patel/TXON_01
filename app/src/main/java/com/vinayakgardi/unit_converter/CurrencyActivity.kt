package com.vinayakgardi.unit_converter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class CurrencyActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency)

        val convert : Button = findViewById(R.id.currencyConvert)
        val cedittext : EditText = findViewById(R.id.cedittext)
        val currencytext : TextView = findViewById(R.id.currencytext)



        convert.setOnClickListener {
            currencytext.text=""
            val rupee : Float =  cedittext.text.toString().toFloat()
            val dollar : Float = rupee * 0.012f
            val euro  : Float = rupee *0.011f
            val egyptianpound : Float = rupee* 0.37f
            val dihram : Float = rupee *0.044f
            val jpnyen : Float = rupee * 1.62f

            currencytext.append("Currency value in USD: $dollar $\n")
            currencytext.append("Currency value in Euro : $euro Є\n")
            currencytext.append("Currency value in EPound : $egyptianpound E£\n")
            currencytext.append("Currency value in AED : $dihram AED\n")
            currencytext.append("Currency value in JYen : $jpnyen ¥\n")

        }
//
    }
}