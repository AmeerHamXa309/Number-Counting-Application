package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        //var toast = Toast.makeText(this, "First Page", Toast.LENGTH_LONG)
        //toast.show()

        val firstpage_next = findViewById<Button>(R.id.one_button)
        firstpage_next.setOnClickListener(){
            val goto_second : Intent = Intent(applicationContext,second::class.java)
            startActivity(goto_second)
        }
    }
}