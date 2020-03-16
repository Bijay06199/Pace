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
        val layoutHebrew = findViewById<LinearLayout>(R.id.layoutHebrew)
        val layoutUk = findViewById<LinearLayout>(R.id.layoutUk)
        val layoutVietnam = findViewById<LinearLayout>(R.id.layoutVietnam)
        val layoutRussia = findViewById<LinearLayout>(R.id.layoutRussian)
        val layoutSpanish = findViewById<LinearLayout>(R.id.layoutSpanish)
        val layoutNepal = findViewById<LinearLayout>(R.id.layoutNepal)

        val btnConfirm= findViewById<Button>(R.id.btnConfirm)

        val japanTick= findViewById<ImageView>(R.id.japanTick)
        val ukTick= findViewById<ImageView>(R.id.ukTick)
        val hebrewTick= findViewById<ImageView>(R.id.hebrewTick)
        val vietnamTick= findViewById<ImageView>(R.id.vietnamTick)
        val russiaTick= findViewById<ImageView>(R.id.russiaTick)
        val spanishTick= findViewById<ImageView>(R.id.spanishTick)
        val nepalTick= findViewById<ImageView>(R.id.nepalTick)


        japanTick.visibility=View.INVISIBLE
        ukTick.visibility=View.INVISIBLE
        hebrewTick.visibility=View.INVISIBLE
        vietnamTick.visibility=View.INVISIBLE
        russiaTick.visibility=View.INVISIBLE
        spanishTick.visibility=View.INVISIBLE
        nepalTick.visibility=View.INVISIBLE








        if(savedInstanceState==null){


            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.VISIBLE
            hebrewTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
            russiaTick.visibility=View.INVISIBLE
            spanishTick.visibility=View.INVISIBLE
            nepalTick.visibility=View.INVISIBLE
            setlocate("en")
            btnConfirm.text=getText(R.string.confirm)


        }


        btnConfirm.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@WelcomeActivity, WelcomeSplash::class.java)
            startActivity(intent)
            finish()


        })



        layoutJapan.setOnClickListener(View.OnClickListener {


            japanTick.visibility= View.VISIBLE
            ukTick.visibility=View.INVISIBLE
            hebrewTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
            russiaTick.visibility=View.INVISIBLE
            spanishTick.visibility=View.INVISIBLE
            nepalTick.visibility=View.INVISIBLE
            setlocate("ja")
            btnConfirm.text=getText(R.string.confirm)

        })


        layoutHebrew.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            hebrewTick.visibility=View.VISIBLE
            vietnamTick.visibility=View.INVISIBLE
            russiaTick.visibility=View.INVISIBLE
            spanishTick.visibility=View.INVISIBLE
            nepalTick.visibility=View.INVISIBLE
            setlocate("in")
            btnConfirm.text=getText(R.string.confirm)
        })

        layoutUk.setOnClickListener(View.OnClickListener {


            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.VISIBLE
            hebrewTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
            russiaTick.visibility=View.INVISIBLE
            spanishTick.visibility=View.INVISIBLE
            nepalTick.visibility=View.INVISIBLE
            setlocate("en")
            btnConfirm.text=getText(R.string.confirm)


        })


        layoutVietnam.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            hebrewTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.VISIBLE
            russiaTick.visibility=View.INVISIBLE
            spanishTick.visibility=View.INVISIBLE
            nepalTick.visibility=View.INVISIBLE
            setlocate("vi")
            btnConfirm.text=getText(R.string.confirm)
        })

        layoutSpanish.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            hebrewTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
            russiaTick.visibility=View.INVISIBLE
            spanishTick.visibility=View.VISIBLE
            nepalTick.visibility=View.INVISIBLE
            setlocate("vi")
            btnConfirm.text=getText(R.string.confirm)
        })

        layoutRussia.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            hebrewTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
            russiaTick.visibility=View.VISIBLE
            spanishTick.visibility=View.INVISIBLE
            nepalTick.visibility=View.INVISIBLE
            setlocate("vi")
            btnConfirm.text=getText(R.string.confirm)
        })

        layoutNepal.setOnClickListener(View.OnClickListener {




            japanTick.visibility= View.INVISIBLE
            ukTick.visibility=View.INVISIBLE
            hebrewTick.visibility=View.INVISIBLE
            vietnamTick.visibility=View.INVISIBLE
            russiaTick.visibility=View.INVISIBLE
            spanishTick.visibility=View.INVISIBLE
            nepalTick.visibility=View.VISIBLE
            setlocate("vi")
            btnConfirm.text=getText(R.string.confirm)
        })



        txtWelcome.text="Welcome !"
        txtSelect.text="Please select your language"
        txtJapan.text="Japanese"
        txtEnglish.text="English"
        txtHebrew.text="Hebrew"
        txtVietnam.text="Tieng Viet"
        txtSpanish.text="Spanish"
        txtRussia.text="Russian"
        txtNepal.text="Nepal"



        txtWelcome.typeface=typeface
        txtSelect.typeface=typeface
        txtJapan.typeface=typeface
        txtEnglish.typeface=typeface
        txtHebrew.typeface=typeface
        txtVietnam.typeface=typeface
        txtRussia.typeface=typeface
        txtSpanish.typeface=typeface
        txtNepal.typeface=typeface




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
