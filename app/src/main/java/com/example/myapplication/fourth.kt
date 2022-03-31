package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val fourthpage_next = findViewById<Button>(R.id.four_button)
        fourthpage_next.setOnClickListener(){
            val goto_fifth :Intent = Intent(applicationContext, fifth::class.java)
            startActivity(goto_fifth)
        }
    }
}