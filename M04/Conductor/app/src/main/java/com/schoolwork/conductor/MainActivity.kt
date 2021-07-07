package com.schoolwork.conductor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import com.schoolwork.conductor.Controllers.HomeController

class MainActivity : AppCompatActivity() {

    private lateinit var router: Router
    private val container: ViewGroup by lazy {
        this.findViewById<ConstraintLayout>(R.id.activity_main_parent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        router = Conductor.attachRouter(this, container, savedInstanceState)
        if (!router.hasRootController()){
            router.setRoot(RouterTransaction.with(HomeController()))
        }

    }

    override fun onBackPressed() {
        if (!router.handleBack()){
            super.onBackPressed()
        }
    }
}
