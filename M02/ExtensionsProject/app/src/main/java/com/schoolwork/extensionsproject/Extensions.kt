package com.schoolwork.extensionsproject

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.widget.ImageView
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

fun Context.notification(title: String = "Notification", message:String, notifyId: Int, channelId: String = ""){
    val notificationBuilder = NotificationCompat.Builder(this, channelId)
    notificationBuilder.setContentTitle(title)
        .setPriority(NotificationManager.IMPORTANCE_DEFAULT)
        .setContentText(message)
        .setSmallIcon(R.drawable.ic_launcher_foreground)
        .setColor(ContextCompat.getColor(this, R.color.colorPrimary))
        .setDefaults(Notification.DEFAULT_ALL)

    val notifManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
        val name = "Default Notifications Channel"
        val notifChannel = NotificationChannel(channelId, name, NotificationManager.IMPORTANCE_DEFAULT)
        notifChannel.description = "Where you find default notifs"
        notifManager.createNotificationChannel(notifChannel)
    }
    notifManager.notify(notifyId, notificationBuilder.build())
}

fun ImageView.loadImageUrl(url: String){
    Glide.with(this.context).load(url).into(this)
}