package com.example.pace.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pace.R
import com.example.pace.Saved_fragment
import com.example.pace.User_fragment
import kotlinx.android.synthetic.main.activity_share.*

class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)


        iconback.setOnClickListener(View.OnClickListener {

           // val intent= Intent(this@ShareActivity.applicationContext,User_fragment::class.java)
          //  startActivity(intent)


        })
    }
}
