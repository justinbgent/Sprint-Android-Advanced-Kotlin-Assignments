package com.schoolwork.conductorproject.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.ControllerChangeType
import com.schoolwork.conductorproject.R

class SubTwo: BaseController(), SubOne.TextToSubTwo {
    private var text = ""

    override fun textToDisplay(string: String) {
        text = string
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.subtwo, container, false)
    }

    override fun onChangeEnded(
        changeHandler: ControllerChangeHandler,
        changeType: ControllerChangeType
    ) {
        super.onChangeEnded(changeHandler, changeType)

        val textView = view?.findViewById<TextView>(R.id.txt_subtwo)

        if (text != ""){
            textView?.text = text
        }
    }

    override fun onDestroy() {
        subTwo = SubTwo()
        subTwo.text = text
        super.onDestroy()
    }
}