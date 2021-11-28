package com.example.kidslearningapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AlphabetDetailACtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet_detail)
        val name = intent.getStringExtra("name")!!.lowercase()
        val iv = findViewById<ImageView>(R.id.imageView)

        val id = resources.getIdentifier(name,"drawable",packageName)
        iv.setImageResource(id)

        val mid = resources.getIdentifier(name,"raw",packageName)
        val mp = MediaPlayer.create(this,mid)
        mp.start()
    }
}