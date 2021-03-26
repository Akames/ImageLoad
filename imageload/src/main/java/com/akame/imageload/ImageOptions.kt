package com.akame.imageload

import android.content.Context
import android.widget.ImageView
import com.akame.imageload.GliderLoaderManger
import com.akame.imageload.ImageCallBack
import com.akame.imageload.ImageCornerType

class ImageOptions {

    var context: Any? = null

    var placeholderRes = -1

    var errorRes = -1

    //高斯模糊度
    var gsBlur = -1

    //放大倍数
    var gsEnlarge = 10

    var round = -1

    var roundType = ImageCornerType.ALL

    var borderWidth = -1

    var borderColor = -1

    var borderRound = 0

    var borderColors: IntArray = intArrayOf()

    var isCenterCrop = false

    var isCircleCrop = false

    var isConstrain = false

    var imagePath: Any? = null

    var imageView: ImageView? = null

    var imageCallBack: ImageCallBack? = null


}