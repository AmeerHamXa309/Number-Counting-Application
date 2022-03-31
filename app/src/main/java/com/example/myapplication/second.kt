package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var toast = Toast.makeText(this, "Second Page", Toast.LENGTH_LONG)
        toast.show()

        val secondpage_next = findViewById<Button>(R.id.two_button)
        secondpage_next.setOnClickListener(){
            val goto_third :Intent = Intent(applicationContext,third::class.java)
            startActivity(goto_third)
        }
    }
}