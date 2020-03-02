package com.example.pace.Activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.pace.R
import kotlinx.android.synthetic.main.activity_welcome.*
import java.util.*

class WelcomeActivity : AppCompatActivity() {
   val count:Int=0
    val tempInt:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadlocate()
        setContentView(R.layout.activity_welcome)
       //checkFirstOpen()





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
            setlocate("en")


        }


        btnConfirm.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@WelcomeActivity, WelcomeSplash::class.java)
            startActivity(intent)
            finish()


        })



        layoutJapan.setOnClickListener(View.OnClickListener {


            japanTick.visibility= View.VISIBLE
            ukTick.visibility=View.INVISIBLE
            indonesiaTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
            setlocate("ja")
        })


        layoutIndonesia.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            indonesiaTick.visibility=View.VISIBLE
            vietnamTick.visibility=View.INVISIBLE
            setlocate("in")
        })

        layoutUk.setOnClickListener(View.OnClickListener {


            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.VISIBLE
            indonesiaTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
            setlocate("en")


        })


        layoutVietnam.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            indonesiaTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.VISIBLE
            setlocate("vi")
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

    private fun loadlocate() {
        val sharedPreferences=getSharedPreferences("Settings", Activity.MODE_PRIVATE)
        val language= sharedPreferences.getString("My lang","")
        setlocate(language)

    }



    private fun setlocate(Lang: String?) {

        val locale= Locale(Lang)

        Locale.setDefault(locale)

        val config= Configuration()

        config.locale= locale
        baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)

        val editor= getSharedPreferences("Settings",Context.MODE_PRIVATE).edit()
        editor.putString("My lang",Lang)
        editor.apply()

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun checkFirstOpen() {
        val isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
            .getBoolean("isFirstRun", true)
        if (!isFirstRun)
        {
            val intent = Intent(this@WelcomeActivity, WelcomeSplash::class.java)
            startActivity(intent)
            finish()

        }
        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isFirstRun",
            false).apply()
    }

}
