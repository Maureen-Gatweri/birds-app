package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdFiveBinding
import com.example.hello.databinding.ActivityBirdFourBinding
import com.squareup.picasso.Picasso

class bird_four_activity : AppCompatActivity() {
    lateinit var binding: ActivityBirdFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBirdFourBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.imageView11.setOnClickListener{
            finish()
        }
      binding.imageView12.setOnClickListener{
          val intent=Intent(this,activity_bird_five::class.java)
          startActivity(intent)
        }


        Picasso.get().load("https://i.pinimg.com/474x/d2/ca/48/d2ca481e5ade3bb0eb8ffe42cbb0a59c.jpg").into(binding.imageView10)


    }
}


