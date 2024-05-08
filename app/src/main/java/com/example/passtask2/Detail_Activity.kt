package com.example.passtask2

import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class Detail_Activity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val location = intent.getParcelableExtra("location", Location::class.java)

        location?.let{

            val vName = findViewById<TextView>(R.id.title_place)
            vName.text = it.name


            val vAuthor = findViewById<TextView>(R.id.Location)
            vAuthor.text = it.author

            val vVisited = findViewById<TextView>(R.id.editTextDate)
            vVisited.text = it.visited


            val picture = findViewById<ImageView>(R.id.imageView)
            val drawable = ContextCompat.getDrawable(this, it.image)
            picture.setImageDrawable(drawable)



        }




        }

    }

