package com.example.mycalculator

import android.graphics.Insets.add
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    lateinit var etnumber1: EditText
    lateinit var etnunumber2: EditText
    lateinit var tvCalc: TextView
    lateinit var tvResults: TextView
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnumber1 = findViewById(R.id.etnumber1)
        etnunumber2 = findViewById(R.id.etnumber2)
        tvCalc = findViewById(R.id.tvCalc)
        tvResults = findViewById(R.id.tvResults)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        btnAdd.setOnClickListener {
            val number1 = etnumber1.text.toString()
            val number2 = etnunumber2.text.toString()
            if (number1.isBlank()) {
                etnumber1.setError("First number is required")
                return@setOnClickListener
            } else if (number2.isBlank()) {
                etnunumber2.setError("second number is required")
                return@setOnClickListener
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                add(number1.toInt(), number2.toInt())
            }


        }
        btnSubtract.setOnClickListener {
            val number1 = etnumber1.text.toString()
            val number2 = etnunumber2.text.toString()
            if (number1.isBlank()) {
                etnumber1.setError("First number is required")
                return@setOnClickListener
            } else if (number2.isBlank()) {
                etnunumber2.setError("second number is required")
                return@setOnClickListener
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                subtract(number1.toInt(), number2.toInt())
            }


        }
        btnMultiply.setOnClickListener {
            val number1 = etnumber1.text.toString()
            val number2 = etnunumber2.text.toString()
            if (number1.isBlank()) {
                etnumber1.setError("First number is required")
                return@setOnClickListener
            } else if (number2.isBlank()) {
                etnunumber2.setError("second number is required")
                return@setOnClickListener
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                multiply(number1.toInt(), number2.toInt())
            }


        }
        btnModulus.setOnClickListener {
            val number1 = etnumber1.text.toString()
            val number2 = etnunumber2.text.toString()
            if (number1.isBlank()) {
                etnumber1.setError("First number is required")
                return@setOnClickListener
            } else if (number2.isBlank()) {
                etnunumber2.setError("second number is required")
                return@setOnClickListener
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                modulus(number1.toInt(), number2.toInt())
            }


        }
//        btnAdd.setOnClickListener {
//            val number1 = etnumber1.text.toString()
//            val number2 = etnunumber2.text.toString()
//            if (number1.isBlank()) {
//                etnumber1.setError("First number is required")
//                return@setOnClickListener
//            } else if (number2.isBlank()) {
//                etnunumber2.setError("second number is required")
//                return@setOnClickListener
//            }
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//                add(number1.toInt(), number2.toInt())
//            }
//
//
//        }
    }

    fun add(number1: Int, number2: Int) {
        val result = number1 + number2
        tvResults.text = result.toString()
    }

    fun multiply(number1: Int, number2: Int) {
        val result = number1 * number2
        tvResults.text = result.toString()
    }

    fun subtract(number1: Int, number2: Int) {
        val result = number1 - number2
        tvResults.text = result.toString()
    }

    fun modulus(number1: Int, number2: Int) {
        val result = number1 % number2
        tvResults.text = result.toString()
    }
}