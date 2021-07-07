package com.schoolwork.extensionsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.notification(message = "This is my Notification", notifyId = 0)

        image_view.loadImageUrl("https://images-gmi-pmc.edge-generalmills.com/7d6f3a8e-2eca-4c61-8988-489b40546395.jpg")

    }
}
