package com.example.passtask2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







        val Coles = Location("Coles", "Coles", "05/05/2024", image = R.drawable.coles)
        val YarraRiver = Location("Yarra River", "Yarrariver","24/04/2024", image = R.drawable.yarrariver)
        val FlindersStation = Location("Flinders Station", "FlindersStation","01/05/2024", image = R.drawable.station)
        val GreatOceanRoad = Location("Ocean Road", "GreatOceanRoad","09/03/2024", image = R.drawable.oceansroad)

        val vColes = findViewById<ImageView>(R.id.Coles)
        vColes.setOnClickListener{

            val intent = Intent(this , Detail_Activity::class.java)
            intent.putExtra("location" , Coles)
            startActivity(intent)



        }

        val vYarraRiver = findViewById<ImageView>(R.id.YarraRiver)
        vYarraRiver.setOnClickListener{
            val intent = Intent(this , Detail_Activity::class.java)
            intent.putExtra("location" , YarraRiver)
            startActivity(intent)

        }

        val vFlindersStation = findViewById<ImageView>(R.id.Flinderstation)
        vFlindersStation.setOnClickListener{

            val intent = Intent(this , Detail_Activity::class.java)
            intent.putExtra("location" , FlindersStation)
            startActivity(intent)
        }

        val vGreatOceanRoad = findViewById<ImageView>(R.id.GreatOceanRoad)
        vGreatOceanRoad.setOnClickListener{
            val intent = Intent(this , Detail_Activity::class.java)
            intent.putExtra("location" , GreatOceanRoad)
            startActivity(intent)

        }


    }
}