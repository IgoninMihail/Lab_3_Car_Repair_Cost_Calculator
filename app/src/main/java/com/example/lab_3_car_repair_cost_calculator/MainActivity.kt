package com.example.lab_3_car_repair_cost_calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var fio: EditText
    private lateinit var start: Button
    private lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fio=findViewById(R.id.fio)
        start=findViewById(R.id.buttonStart)
        result=findViewById(R.id.result)
        resultEdit()
    }

    fun onClick(view: View) {
        val urlIntent = Intent(this, SecondActivity::class.java)
        val str = fio.text.toString()
        urlIntent.putExtra("FIO", str)
        startActivity(urlIntent)
    }
    fun resultEdit(){
        val da = intent.getStringExtra("RESULT")
        result.text = da
    }
}