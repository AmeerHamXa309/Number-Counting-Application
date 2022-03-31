package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val thirdpage_next = findViewById<Button>(R.id.three_button)
        thirdpage_next.setOnClickListener(){
            val goto_fourth : Intent = Intent(applicationContext, fourth::class.java)
            startActivity(goto_fourth)
        }
    }
}