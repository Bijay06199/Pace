package com.example.pace.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pace.R
import android.content.Intent
import android.provider.MediaStore
import android.graphics.Bitmap
import android.app.Activity
import android.app.PendingIntent.getActivity
import android.content.Context
import android.os.Handler
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.*
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.activity_email2.*
import java.io.IOException


class EditProfileActivity : AppCompatActivity() {

    var   GET_FROM_GALLERY = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)




         val upload=findViewById<LinearLayout>(R.id.upload)
        val checkMale= findViewById<CheckBox>(R.id.checkMale)
        val checkFemale=findViewById<CheckBox>(R.id.checkFemale)
        val checkOther= findViewById<CheckBox>(R.id.checkOther)
        val txtSave=findViewById<TextView>(R.id.txtSave)

        val imageBackProfile=findViewById<ImageView>(R.id.imgBackProfile)





        imageBackProfile.setOnClickListener(View.OnClickListener {
            val intent=Intent(this@EditProfileActivity,MyProfileActivity::class.java)
            startActivity(intent)
            finish()
        })


        checkMale.setOnClickListener(View.OnClickListener {

            if(checkMale.isChecked){

                checkFemale.isChecked=false
                checkOther.isChecked=false
            }
        })



        checkFemale.setOnClickListener(View.OnClickListener {

            if(checkFemale.isChecked){

                checkMale.isChecked=false
                checkOther.isChecked=false
            }
        })

        checkOther.setOnClickListener(View.OnClickListener {

            if(checkOther.isChecked){

                checkFemale.isChecked=false
                checkMale.isChecked=false
            }
        })

        upload.setOnClickListener(View.OnClickListener {
            startActivityForResult(
                Intent(
                    Intent.ACTION_PICK,
                    android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
                ), GET_FROM_GALLERY
            )


        })



        txtSave.setOnClickListener(View.OnClickListener {

            val inflater: LayoutInflater =
                getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.popupsave_layout, null)
            // overlap1.setBackgroundResource(R.drawable.blurimage)
            overlapSave.setBackgroundColor(resources.getColor(R.color.blur))




            val popupWindow = PopupWindow(
                view, // Custom view to show in popup window
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of popup window
                LinearLayout.LayoutParams.MATCH_PARENT // Window height

            )

            val handler = Handler()
            handler.postDelayed(object:Runnable {
                public override fun run() {
                    //ToDo your function
                    //hide your popup here
                    popupWindow.dismiss()

                    val intent=Intent(this@EditProfileActivity,MyProfileActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }, 1500)
            //  popupWindow.elevation = 10.0F
            //    popupWindow.isFocusable=true
            popupWindow.animationStyle=R.style.popup_animation
            popupWindow.isTouchable=true
            popupWindow.dismiss()
            popupWindow.isOutsideTouchable=true


            popupWindow.setOnDismissListener(PopupWindow.OnDismissListener {



                overlapSave.setBackgroundColor(resources.getColor(R.color.transparentpop))

            })







            TransitionManager.beginDelayedTransition(relativeSave)
            popupWindow.showAtLocation(
                relativeSave, // Location to display popup window
                Gravity.CENTER, // Exact position of layout to display popup
                0, // X offset
                0 // Y offset
            )

        })



    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK)
            when (requestCode) {
                GET_FROM_GALLERY -> {
                    val selectedImage = data!!.data
                    try {
                        val bitmap = MediaStore.Images.Media.getBitmap(
                            this@EditProfileActivity.getContentResolver(),
                            selectedImage
                        )
                        galleryImage.setImageBitmap(bitmap)
                    } catch (e: IOException) {
                        Log.i("TAG", "Some exception $e")
                    }

                }
            }
    }


}


