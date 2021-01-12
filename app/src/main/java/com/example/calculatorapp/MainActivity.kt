package com.example.calculatorapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.calculatorapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var lastNumeric: Boolean = false
    var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onDigit(view: View){
        binding.tvInputField.append((view as Button).text)
        lastNumeric = true
    }

    fun onClear(view: View){
        binding.tvInputField.text = ""
        lastNumeric = false
        lastDot = false
    }

    fun onDecimalPoint(view: View){
        if(lastNumeric && !lastDot){
            binding.tvInputField.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}