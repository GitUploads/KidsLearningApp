package com.example.kidslearningapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FruitDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_detail)

        var fname = intent.getStringExtra("name")?.lowercase()

        var iv = findViewById<ImageView>(R.id.imageView2)
        var iid = resources.getIdentifier(fname,"drawable",packageName)
        iv.setImageResource(iid)

        var mid = resources.getIdentifier(fname,"raw",packageName)
        var mp = MediaPlayer.create(this,mid)
        mp.start()

    }
}