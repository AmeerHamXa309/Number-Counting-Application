package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fifth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        val fifthpage_next = findViewById<Button>(R.id.fifth_button)
        fifthpage_next.setOnClickListener(){
            val goto_sixth :Intent = Intent(applicationContext,sixth::class.java)
            startActivity(goto_sixth)
        }
    }
}