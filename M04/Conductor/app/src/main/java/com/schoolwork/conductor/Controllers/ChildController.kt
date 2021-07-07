package com.schoolwork.conductor.Controllers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.ControllerChangeType
import com.schoolwork.conductor.R
import kotlin.random.Random

//class ChildController<T>(targetController: T): BaseController()
//        where T: Controller, T: ChildController.ChildContainer{
class ChildController<T>(): BaseController()
        where T: Controller, T: ChildController.ChildContainer{

    constructor(targetController: T): this(){
        setTargetController(targetController)
    }

    interface ChildContainer{
        fun recieveMessage(int: Int)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.home_controller_layout, container, false)
    }

    override fun onChangeEnded(
        changeHandler: ControllerChangeHandler,
        changeType: ControllerChangeType
    ) {
        super.onChangeEnded(changeHandler, changeType)
        val next = view?.findViewById<Button>(R.id.btn_next_controller)
        next?.text = "Pass Data"
        next?.setOnClickListener {
            (targetController as ChildContainer).recieveMessage(Random.nextInt())
        }
        view?.findViewById<Button>(R.id.btn_previous_controller)?.setOnClickListener {
            router.popCurrentController()
        }
    }
}