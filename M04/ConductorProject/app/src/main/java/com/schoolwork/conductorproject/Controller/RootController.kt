package com.schoolwork.conductorproject.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.ControllerChangeType
import com.schoolwork.conductorproject.R

class RootController: BaseController() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.root_controller, container, false)
    }

    override fun onChangeEnded(
        changeHandler: ControllerChangeHandler,
        changeType: ControllerChangeType
    ) {
        super.onChangeEnded(changeHandler, changeType)

        view?.findViewById<Button>(R.id.btn_top)?.setOnClickListener {

        }
        view?.findViewById<Button>(R.id.btn_bot)?.setOnClickListener {

        }
    }
}