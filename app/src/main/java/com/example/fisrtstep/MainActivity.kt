package com.example.fisrtstep

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img: ImageView = findViewById(R.id.image)
        val butup: Button = findViewById(R.id.buttonup)
        val butd: Button = findViewById(R.id.buttondown)
        val butl: Button = findViewById(R.id.buttonleft)
        val butr: Button = findViewById(R.id.buttonright)
        val butv: Button = findViewById(R.id.buttonv)
        val but2: Button = findViewById(R.id.button2)

        butv.setOnClickListener {
            if (img.visibility == View.VISIBLE) {
                img.visibility = View.INVISIBLE
            } else {
                img.visibility = View.VISIBLE
            }
        }

        butup.setOnClickListener {
            img.y = img.y - 25
        }

        butd.setOnClickListener {
            img.y = img.y + 25
        }

        butl.setOnClickListener {
            img.x = img.x - 25
        }

        butr.setOnClickListener {
            img.x = img.x + 25
        }

        but2.setOnClickListener () {
            val intent: Intent=Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}