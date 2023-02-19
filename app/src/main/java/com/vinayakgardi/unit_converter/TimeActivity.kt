package com.vinayakgardi.unit_converter

//import android.annotation.SuppressLint
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.sql.Time

class TimeActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
        val TimeConvert : Button = findViewById(R.id.TimeConvert)
        val tedittext : EditText = findViewById(R.id.tedittext)
        val timetext : TextView = findViewById(R.id.timetext)

        TimeConvert.setOnClickListener {
              timetext.text = ""
            val hrs : Int = tedittext.text.toString().toInt()
            val min : Int = hrs *60
            val sec : Int = hrs*3600
            val day : Float = hrs/24f
            val month : Float = hrs/730f
            val year : Float = hrs/8760f

            timetext.append("Time in Minutes : $min minutes\n")
            timetext.append("Time in Seconds : $sec seconds\n")
            timetext.append("Time in Day : $day days\n")
            timetext.append("Time in Month : $month months\n")
            timetext.append("Time in Year : $year year\n")



        }
    }
}