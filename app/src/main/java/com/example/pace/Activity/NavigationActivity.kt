package com.example.pace.Activity

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pace.*
import com.example.pace.Activity.Fragments.Chat_fragment
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)









        if (savedInstanceState == null) {
            val fragment = Home_fragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
            home.setTextColor(resources.getColor(R.color.colorAccent))
            chat.setTextColor(resources.getColor(R.color.saved))
            saved.setTextColor(resources.getColor(R.color.saved))
            search.setTextColor(resources.getColor(R.color.saved))
            user.setTextColor(resources.getColor(R.color.saved))







        }





        chat.setOnClickListener(View.OnClickListener {
            val fragment = Chat_fragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()


            home.setTextColor(resources.getColor(R.color.saved))
            chat.setTextColor(resources.getColor(R.color.colorAccent))
            saved.setTextColor(resources.getColor(R.color.saved))
            search.setTextColor(resources.getColor(R.color.saved))
            user.setTextColor(resources.getColor(R.color.saved))
        })


        home.setOnClickListener(View.OnClickListener {
            val fragment = Home_fragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()



            home.setTextColor(resources.getColor(R.color.colorAccent))
            chat.setTextColor(resources.getColor(R.color.saved))
            saved.setTextColor(resources.getColor(R.color.saved))
            search.setTextColor(resources.getColor(R.color.saved))
            user.setTextColor(resources.getColor(R.color.saved))
        })


        saved.setOnClickListener(View.OnClickListener {
            val fragment = Saved_fragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()


            home.setTextColor(resources.getColor(R.color.saved))
            chat.setTextColor(resources.getColor(R.color.saved))
            saved.setTextColor(resources.getColor(R.color.colorAccent))
            search.setTextColor(resources.getColor(R.color.saved))
            user.setTextColor(resources.getColor(R.color.saved))
        })


        search.setOnClickListener(View.OnClickListener {
            val fragment = Search_fragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()


            home.setTextColor(resources.getColor(R.color.saved))
            chat.setTextColor(resources.getColor(R.color.saved))
            saved.setTextColor(resources.getColor(R.color.saved))
            search.setTextColor(resources.getColor(R.color.colorAccent))
            user.setTextColor(resources.getColor(R.color.saved))
        })

        fab.setOnClickListener(View.OnClickListener {
            val fragment = Search_fragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()



        })


        user.setOnClickListener(View.OnClickListener {
            val fragment = User_fragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()



            home.setTextColor(resources.getColor(R.color.saved))
            chat.setTextColor(resources.getColor(R.color.saved))
            saved.setTextColor(resources.getColor(R.color.saved))
            search.setTextColor(resources.getColor(R.color.saved))
            user.setTextColor(resources.getColor(R.color.colorAccent))
        })

        val typeface= Typeface.createFromAsset(assets,"Quicksand_Regular.ttf")

        home.text="Home"
        saved.text="Saved"
        search.text="Search"
        chat.text="Chat"
        user.text="Account"

        home.typeface=typeface
        saved.typeface=typeface
        search.typeface=typeface
        chat.typeface=typeface
        user.typeface=typeface
    }




    }


