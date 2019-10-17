package com.schoolwork.conductorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import com.schoolwork.conductorproject.Controller.RootController
import com.schoolwork.conductorproject.Controller.SubOne
import com.schoolwork.conductorproject.Controller.SubTwo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var router: Router
    private val container = parent_layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        router = Conductor.attachRouter(this, container, savedInstanceState)
        if (!router.hasRootController()){
            router.setRoot(RouterTransaction.with(RootController()))
        }
    }

    override fun onBackPressed() {
        if(!router.handleBack()){
            super.onBackPressed()
        }
    }
}
