package com.schoolwork.extensionsproject

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun Context.loadImageUrl(url: String, imageView: ImageView){
    Glide.with(this).load(url).into(imageView)
}