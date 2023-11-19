package com.example.loginregisterfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class ToolsOpen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tools_open)

        val c=findViewById<CardView>(R.id.cardview_area)
        c.setOnClickListener {
            val intent=Intent(this@ToolsOpen,Toolbox::class.java)
            startActivity(intent)
        }

        val maps=findViewById<ImageView>(R.id.maps)
        maps.setOnClickListener {
            val intent=Intent(this@ToolsOpen,ToolsMaps::class.java)
            startActivity(intent)
        }

    }
}