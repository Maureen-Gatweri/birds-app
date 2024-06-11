package com.example.hello

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdFourBinding
import com.example.hello.databinding.ActivitySixthBirdBinding
import com.squareup.picasso.Picasso

class sixth_bird : AppCompatActivity() {
    lateinit var binding: ActivitySixthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.imageView19.setOnClickListener{
            finish()

        }
        binding.btnNext6.setOnClickListener{
            val intent=Intent(this,sixth_bird::class.java)
            startActivity(intent)

    }
        Picasso.get().load("https://i.pinimg.com/474x/5c/71/24/5c7124b507c2e7ca2dad2318214c466a.jpg").into(binding.imageView19)
    }
}

