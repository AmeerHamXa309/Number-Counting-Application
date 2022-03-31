package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class eigth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eigth)

        val eigthpage_next = findViewById<Button>(R.id.eigth_button)
        eigthpage_next.setOnClickListener(){
            val goto_ninth : Intent = Intent(applicationContext,ninth::class.java)
            startActivity(goto_ninth)
        }
    }
}