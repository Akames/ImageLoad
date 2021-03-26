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
        val image2 = findViewById<ImageView>(R.id.iv_image2)

        /**
         * 使用 第一种普通使用
         */
        ImageLoader(this)
            .isConstrain()
            .round(40)
            .imageView(image)
            .imagePath(path)
            .load()

        /**
         *  第二种 通过kt的扩展使用
         */
        image2.loadEngine(path)
            .isConstrain()
            .round(40)
            .load()
    }
}