package com.example.pace.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pace.Activity.Fragments.Chat_fragment
import com.example.pace.R
import kotlinx.android.synthetic.main.fragment_chat1.*

class Chat1_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_chat1)

        imgBackArrow.setOnClickListener(View.OnClickListener {
            finish()


        })


    }
}
