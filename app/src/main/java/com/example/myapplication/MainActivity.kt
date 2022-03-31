package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start_button = findViewById<Button>(R.id.starter)
        start_button.setOnClickListener(){
            //var toast = Toast.makeText(this, "Counting Application Started", Toast.LENGTH_LONG)
            //toast.show()

            val goto_firstpage : Intent = Intent(applicationContext,first::class.java)
            startActivity(goto_firstpage)
        }
    }
}