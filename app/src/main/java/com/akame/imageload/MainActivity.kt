package com.akame.imageload

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val path = "https://vdposter.bdstatic.com/551857cf5810c9ff7f451930349adaa4.jpeg"
        val image = findViewById<ImageView>(R.id.iv_image)
        ImageLoader.with(this).also {
            it.imagePath = path
            it.borderWidth = 4
            it.borderRound = 16
            it.borderColors = intArrayOf(Color.WHITE, Color.BLUE, Color.RED)
        }.show(image)
    }
}