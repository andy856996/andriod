package com.nttu.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name_input = findViewById<EditText>(R.id.editText_name)
        val height_input = findViewById<EditText>(R.id.editText_height)
        val weight_input = findViewById<EditText>(R.id.editText_weight)
        val button = findViewById<Button>(R.id.button)
        val outPut_text = findViewById<TextView>(R.id.output)
        button.setOnClickListener{
            outPut_text.text = if (weight_input.text.isNotEmpty() && height_input.text.isNotEmpty() && name_input.text.isNotEmpty()) "${name_input.text.toString()} 的 BMI:${(weight_input.text.toString().toDouble()/height_input.text.toString().toDouble().pow(2)).toString()} (${if ((weight_input.text.toString().toDouble()/height_input.text.toString().toDouble().pow(2)<18.5)) "過輕" else (if (weight_input.text.toString().toDouble()/height_input.text.toString().toDouble().pow(2)>24) "過重" else "正常")})" else "result:\n請輸入正確"
        }
    }
}