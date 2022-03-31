package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sixth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        val sixthpage_next = findViewById<Button>(R.id.six_button)
        sixthpage_next.setOnClickListener(){
            val goto_seven :Intent = Intent(applicationContext,seventh::class.java)
            startActivity(goto_seven)
        }
    }
}