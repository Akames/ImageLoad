package com.akame.imageload

import android.widget.ImageView

fun ImageView.loadEngine(imagePath: Any): ImageLoader<*> {
    return ImageLoader(this.context).imageView(this).imagePath(imagePath)
}
