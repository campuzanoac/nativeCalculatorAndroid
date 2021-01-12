package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    var lastNumeric: Boolean = false
    var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onDigit(view: View){
        val tvInput: TextView = findViewById(R.id.tvInputField)
        tvInput.append((view as Button).text)
        lastNumeric = true
    }

    fun onClear(view: View){
        val tvInput: TextView = findViewById(R.id.tvInputField)
        tvInput.text = ""
        lastNumeric = false
        lastDot = false
    }

    fun onDecimalPoint(view: View){
        val tvInput: TextView = findViewById(R.id.tvInputField)
        if(lastNumeric && !lastDot){
            tvInput.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}