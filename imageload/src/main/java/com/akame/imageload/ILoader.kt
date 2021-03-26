package com.akame.imageload

import android.content.Context
import android.widget.ImageView

interface ILoader {
    fun displayImage(options: ImageOptions)

    fun pauseLoad(context: Context)

    fun resumeLoad(context: Context)

    fun clearMemoryCache(context: Context)

    fun cleanMemory(context: Context)
}