package com.schoolwork.conductorproject.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.ControllerChangeType
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.VerticalChangeHandler
import com.schoolwork.conductorproject.R

class SubOne: BaseController() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.subone, container, false)
    }

    interface TextToSubTwo{
        fun textToDisplay(string: String)
    }

    override fun onChangeEnded(
        changeHandler: ControllerChangeHandler,
        changeType: ControllerChangeType
    ) {
        super.onChangeEnded(changeHandler, changeType)

        view?.findViewById<Button>(R.id.btn_save_subone)?.setOnClickListener {
            subTwo = SubTwo()
            subTwo.textToDisplay(view?.findViewById<EditText>(R.id.subone_edit_txt)?.text.toString())
        }
    }
}