package com.example.strbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private var etNum: EditText? = null
    private var tvDisp: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum = findViewById(R.id.etNumber)
        tvDisp = findViewById(R.id.tvDisplay)

        val btnDisp = findViewById<Button>(R.id.btnDisplay)

        btnDisp.setOnClickListener {
            disp()
        }
    }

    private fun disp(){
        val builder = StringBuilder()
        var intNum = etNum?.text.toString().toInt()
        var intAns = 0
        for (intCount in 0..12){
            intAns = intNum * intCount
            builder.append(intNum)
                .append(" * ")
                .append(intCount)
                .append(" = ")
                .append(intAns)
                .append('\n')
        }
        tvDisp?.text = builder
    }
}