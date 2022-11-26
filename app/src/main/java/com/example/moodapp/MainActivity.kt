package com.example.moodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Mod(view:View){
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.full)
        findViewById<TextView>(R.id.textView).setText("I Am Full")
        findViewById<Button>(R.id.button).setText("Jhall Dam")
    }
}