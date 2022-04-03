package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class tenth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenth)

        val tenthpage_next = findViewById<Button>(R.id.ten_button)
        tenthpage_next.setOnClickListener(){
            val goto_main :Intent = Intent(applicationContext,MainActivity::class.java)
            //this flag setting works by clearing all the activities piled up in the stack
            goto_main.flags =
                Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            //goto_main.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(goto_main)
            //finish(); it wont work when navigation is to be done from last activity to first

        }
    }
}