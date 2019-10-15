package com.schoolwork.extensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val num = 5
        println(num.isOdd())
        println(46.isEven())

        println("palindrome")
        println("racecar".isPalindrome())*/

        /*
        val people = listOf<Person>(
            Person("Jane", 25),
            Person("Joe", 54),
            Person("Alice", 35),
            Person("Billy", 15)
        )

        val cars = listOf<Car>(
            Car("Jane", "25")
        )

        people.doesPersonExist("Alice")
        people.doesNameExist("Alice")
        cars.doesNameExist("Jane")


        24.toPowerOf(5.0)
        24.0.pow(5)


        // Using infix extension function
        24 toPowerOf 5.0
        */

        /*
        txt_view.visibility = View.VISIBLE
        txt_view.visible()

        txt_view disappears "Yeah"

        this.showToast("Toasted")

        //this.showAlert("Test", "It works!")
        this.showAlert(message = "Here we go.")
        */

        val car = Car("TheOne", "Lambo")
        val car2 = Car("TheStuff", "Tesla")

        this.showToast(car + car2)

        txt_view.text = car + car2

        var pt1 = Point(2.0, 5.0)
        var pt2 = Point(1.2, 4.6)

        pt1 + pt2
        pt1 - pt2
        pt1 * pt2
        pt1 / pt2
        pt1++
        pt2--

        pt1 == pt2

        pt2 < pt1

    }
}
