package com.example.loginregisterfirebase

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //profile image
   val profile=findViewById<ImageButton>(R.id.img1)
        profile.setOnClickListener {
            val intent=Intent(this@HomeActivity,ProfileActivity::class.java)
            startActivity(intent)
        }
        // profile image

        //chemistry
   val chemistry=findViewById<CardView>(R.id.chemistry)
        chemistry.setOnClickListener {
            val intent=Intent(this@HomeActivity,Chemistry::class.java)
            startActivity(intent)
        }
        //chemistry

        //tools
        val toolsOpen=findViewById<CardView>(R.id.unit_converter)
        toolsOpen.setOnClickListener {
            val intent=Intent(this@HomeActivity,ToolsOpen::class.java)
            startActivity(intent)
        }
        //tools


        //form
       val form = findViewById<CardView>(R.id.form)
        form.setOnClickListener {
            val intent=Intent(this@HomeActivity,Form::class.java)
            startActivity(intent)
        }
        //form

        //physics
        val physics=findViewById<CardView>(R.id.physics)
        physics.setOnClickListener {
            val intent=Intent(this@HomeActivity,Physics::class.java)
            startActivity(intent)
        }
        //physics

        //biology
        val geometry=findViewById<CardView>(R.id.geometry)
        geometry.setOnClickListener {
            val intent=Intent(this@HomeActivity,Biology::class.java)
            startActivity(intent)
        }
        //biology
    }
}