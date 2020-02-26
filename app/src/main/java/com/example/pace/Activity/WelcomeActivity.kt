package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.pace.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")

        val layoutJapan = findViewById<LinearLayout>(R.id.layoutJapan)
        val layoutIndonesia = findViewById<LinearLayout>(R.id.layoutIndonesia)
        val layoutUk = findViewById<LinearLayout>(R.id.layoutUk)
        val layoutVietnam = findViewById<LinearLayout>(R.id.layoutVietnam)
        val btnConfirm= findViewById<Button>(R.id.btnConfirm)

        val japanTick= findViewById<ImageView>(R.id.japanTick)
        val ukTick= findViewById<ImageView>(R.id.ukTick)
        val indonesiaTick= findViewById<ImageView>(R.id.indonesiaTick)
        val vietnamTick= findViewById<ImageView>(R.id.vietnamTick)


        japanTick.visibility=View.INVISIBLE
        ukTick.visibility=View.INVISIBLE
        indonesiaTick.visibility=View.INVISIBLE
        vietnamTick.visibility=View.INVISIBLE



        if(savedInstanceState==null){


            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.VISIBLE
            indonesiaTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE


        }


        btnConfirm.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@WelcomeActivity, WelcomeSplash::class.java)
            startActivity(intent)

        })



        layoutJapan.setOnClickListener(View.OnClickListener {


            japanTick.visibility= View.VISIBLE
            ukTick.visibility=View.INVISIBLE
            indonesiaTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
        })


        layoutIndonesia.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            indonesiaTick.visibility=View.VISIBLE
            vietnamTick.visibility=View.INVISIBLE
        })

        layoutUk.setOnClickListener(View.OnClickListener {


            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.VISIBLE
            indonesiaTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE


        })


        layoutVietnam.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            indonesiaTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.VISIBLE
        })


        txtWelcome.text="Welcome !"
        txtSelect.text="Please select your language"
        txtJapan.text="Japanese"
        txtEnglish.text="English"
        txtIndonesia.text="Bahasa Indonesia"
        txtVietnam.text="Vietnamese"



        txtWelcome.typeface=typeface
        txtSelect.typeface=typeface
        txtJapan.typeface=typeface
        txtEnglish.typeface=typeface
        txtIndonesia.typeface=typeface
        txtVietnam.typeface=typeface




    }
}
