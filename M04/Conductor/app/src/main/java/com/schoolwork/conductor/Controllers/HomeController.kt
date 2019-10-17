package com.schoolwork.conductor.Controllers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.ControllerChangeType
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.HorizontalChangeHandler
import com.schoolwork.conductor.R

class HomeController(private var message: String? = null): BaseController(), ChildController.ChildContainer {
    override fun recieveMessage(int: Int) {
        message = message?.plus(": $int") ?: "$int"
        view?.findViewById<TextView>(R.id.home_text_view)?.text = message?:"Hello \nController${router.backstackSize}"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.home_controller_layout, container, false)
        view.findViewById<TextView>(R.id.home_text_view).text = message?:"Hello Conductor!\nController${router.backstackSize}"
        return view
    }

    private fun getMessage(message: String){
        // Handle Message
    }

    override fun onChangeEnded(
        changeHandler: ControllerChangeHandler,
        changeType: ControllerChangeType
    ) {
        super.onChangeEnded(changeHandler, changeType)

        view?.findViewById<Button>(R.id.btn_next_controller)?.setOnClickListener {
            router.pushController(
                RouterTransaction.with(ChildController(this)/*HomeController("New HomeController! ${router.backstackSize}")*/)
                .pushChangeHandler(HorizontalChangeHandler())
                .popChangeHandler(HorizontalChangeHandler()))
        }

        val previousButton = view?.findViewById<Button>(R.id.btn_previous_controller)
        if (router.backstackSize <= 1){
            previousButton?.isEnabled = false
        }
        else{
//            (parentController as (HomeController)).getMessage("new string")

            previousButton?.setOnClickListener {
                // checked above, if current controller is root controller and not go back
                router.popCurrentController()
            }
        }

    }
}