package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seventh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh)

        val seventhpage_next = findViewById<Button>(R.id.seven_button)
        seventhpage_next.setOnClickListener(){
            val goto_eigth : Intent = Intent(applicationContext,eigth::class.java)

            startActivity(goto_eigth)
        }
    }
}