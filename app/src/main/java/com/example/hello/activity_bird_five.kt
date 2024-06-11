package com.example.hello

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdFiveBinding
import com.squareup.picasso.Picasso

class activity_bird_five : AppCompatActivity() {
    lateinit var binding: ActivityBirdFiveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBirdFiveBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.imageView14.setOnClickListener{
            finish()
        }
        binding.imageView15.setOnClickListener{
            val intent=Intent(this,sixth_bird::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://i.pinimg.com/474x/77/81/c7/7781c7db899983c68903ee3aa88124a4.jpg").into(binding.imageView13)
    }
}

