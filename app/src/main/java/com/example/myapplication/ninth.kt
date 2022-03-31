package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ninth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninth)
        val ninepage_next = findViewById<Button>(R.id.nine_button)
        ninepage_next.setOnClickListener(){
            val goto_tenth :Intent = Intent(applicationContext,tenth::class.java)
            startActivity(goto_tenth)
        }
    }
}