package com.vinayakgardi.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class WeightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight)

        val WeightConvert : Button = findViewById(R.id.WeightConvert)
        val wedittext : EditText = findViewById(R.id.wedittext)
        val weighttext : TextView = findViewById(R.id.weighttext)

        WeightConvert.setOnClickListener {
            weighttext.text =""
            val kg : Int = wedittext.text.toString().toInt()
            val gram : Int = kg * 1000;
            val pound : Float = kg* 2.205f
            val milligram : Float = kg *1e+6f
            val ton : Float = kg/1000f
            val ounce : Float = kg*35.274f

            weighttext.append("Weight in Grams : $gram g \n")
            weighttext.append("Weight in Pound : $pound lb\n")
            weighttext.append("Weight in Milligrams : $milligram mg  \n")
            weighttext.append("Weight in Tonne : $ton ton\n")
            weighttext.append("Weight in Ounces : $ounce oz \n")



        }

    }
}