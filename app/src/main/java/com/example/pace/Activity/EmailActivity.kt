package com.example.pace.Activity

import android.content.Context
import android.media.audiofx.DynamicsProcessing
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.transition.TransitionManager
import com.example.pace.R
import kotlinx.android.synthetic.main.activity_email2.*
import kotlinx.android.synthetic.main.activity_sale_home.*
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class EmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email2)


        imgBackArrow.setOnClickListener(View.OnClickListener {

            finish()
        })


        sendemail.setOnClickListener(View.OnClickListener {

            val inflater: LayoutInflater =
                getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.popup_layout2, null)
            overlap1.setBackgroundResource(R.drawable.blurimage)




            val popupWindow = PopupWindow(
                view, // Custom view to show in popup window
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of popup window
                LinearLayout.LayoutParams.WRAP_CONTENT // Window height

            )

            val handler = Handler()
            handler.postDelayed(object:Runnable {
                public override fun run() {
                    //ToDo your function
                    //hide your popup here
                    popupWindow.dismiss()
                }
            }, 1500)
            popupWindow.elevation = 10.0F
            popupWindow.width=1000
            popupWindow.isFocusable=true
            popupWindow.animationStyle=R.style.popup_animation
            popupWindow.isTouchable=true
            popupWindow.dismiss()
            popupWindow.height=220
            popupWindow.isOutsideTouchable=true


            popupWindow.setOnDismissListener(PopupWindow.OnDismissListener {



                overlap1.setBackgroundColor(resources.getColor(R.color.transparentpop))

            })







            TransitionManager.beginDelayedTransition(relativelayout1)
            popupWindow.showAtLocation(
                relativelayout1, // Location to display popup window
                Gravity.CENTER, // Exact position of layout to display popup
                0, // X offset
                0 // Y offset
            )

        })

    }
}
