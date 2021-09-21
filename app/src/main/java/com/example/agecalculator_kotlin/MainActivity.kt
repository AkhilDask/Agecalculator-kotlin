package com.example.agecalculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ageCalculate(view: View){
        val current = Calendar.getInstance().get(Calendar.YEAR)
       Age.text = "Age: "+ (current - editText.text.toString().toInt())
    }
}