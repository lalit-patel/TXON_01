package com.vinayakgardi.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LengthActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)

       val convert: Button = findViewById(R.id.lengthConvert)
       val lengthtext: TextView = findViewById(R.id.Lengthtext)
       val edittext: EditText = findViewById(R.id.ledittext)



        convert.setOnClickListener {
            lengthtext.text =""
            val meter : Float = edittext.text.toString().toFloat()
            val cm : Float= meter * 100.00f
            val inch : Float =meter *39.37f
            val foot : Float = meter * 3.281f
            val km : Float = meter * 0.001f
            val mile : Float = meter / 1609f
            val mm : Float = meter * 1000.0f

            lengthtext.append("length is Kilometer is : $km km \n")
            lengthtext.append("length is Centimeter is : $cm cm \n")
            lengthtext.append("length is Millimeter is : $mm mm\n")
            lengthtext.append("length is Miles is : $mile miles\n")
            lengthtext.append("length is Inch is : $inch inches\n")
            lengthtext.append("length is Foot is : $foot feets\n")



        }


    }
}



