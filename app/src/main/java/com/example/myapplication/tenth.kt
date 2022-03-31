package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tenth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenth)

        val tenthpage_next = findViewById<Button>(R.id.ten_button)
        tenthpage_next.setOnClickListener(){
            val goto_main :Intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(goto_main)
        }
    }
}