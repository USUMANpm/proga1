package com.example.laststep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val but3: Button = findViewById(R.id.button3)

        but3.setOnClickListener () {
            val intent: Intent=Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}