package com.akame.imageload

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import androidx.fragment.app.Fragment


object ImageLoader {
    private val imageOption by lazy {
        ImageOptions()
    }

    fun with(context: Context): ImageOptions {
        return imageOption.apply {
            this.context = context
        }
    }

    fun with(context: Activity): ImageOptions {
        return imageOption.apply {
            this.context = context
        }
    }

    fun with(context: Fragment): ImageOptions {
        return imageOption.apply {
            this.context = context
        }
    }

    fun pauseLoad(context: Context) {
        imageOption.pauseLoad(context)
    }

    fun resumeLoad(context: Context) {
        imageOption.resumeLoad(context)
    }

    fun cleanMemory(context: Context) {
        imageOption.cleanMemory(context)
    }

    fun clearMemoryCache(context: Context) {
        imageOption.clearMemoryCache(context)
    }

    fun drawConvertBitmap(drawable: Drawable): Bitmap {
        val w = drawable.intrinsicWidth
        val h = drawable.intrinsicHeight
        val bitmapConfig = Bitmap.Config.RGB_565
        val bitmap = Bitmap.createBitmap(w, h, bitmapConfig)
        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, w, h)
        drawable.draw(canvas)
        return bitmap
//        return (drawable as BitmapDrawable).bitmap
    }
}