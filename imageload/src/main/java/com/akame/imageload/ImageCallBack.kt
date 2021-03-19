package com.akame.imageload

import android.graphics.drawable.Drawable

interface ImageCallBack {

    fun success(drawable: Drawable?)

    fun error()
}