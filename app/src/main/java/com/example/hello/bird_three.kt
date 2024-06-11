package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class bird_three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bird_three)


        val btnPrev12 = findViewById<ImageView>(R.id.imageView16)
        val btnPrev17 = findViewById<ImageView>(R.id.imageView5)

        btnPrev12.setOnClickListener {
            val intent = Intent(this, bird_four_activity::class.java)
            startActivity(intent)
        }
        btnPrev12.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}