package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.imageView6.setOnClickListener{
            finish()
        }


        binding.imageView4.setOnClickListener {
            val intent = Intent(this, activity_bird_five::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://i.pinimg.com/474x/eb/c0/e9/ebc0e9eb1f13c347568ccf9deed09d12.jpg").into(binding.imageView2)

    }
}