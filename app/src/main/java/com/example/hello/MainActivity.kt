package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnNext.setOnClickListener{
            val intent= Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://i.pinimg.com/474x/fc/bd/8e/fcbd8e55707331bd9c3b9de12974084e.jpg").into(binding.imageView)


        }
    }
