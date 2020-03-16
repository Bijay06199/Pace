package com.example.pace.Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.pace.R
import kotlinx.android.synthetic.main.activity_edit_profile.*
import java.io.IOException

class IDVerificationActivity : AppCompatActivity() {

    var GET_FROM_GALLERY=3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idverification)

        val upload1=findViewById<LinearLayout>(R.id.uploadVerification)

        val imageBackVerification=findViewById<ImageView>(R.id.imgBackVerification)

        imageBackVerification.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@IDVerificationActivity,VerifyNowActivity::class.java)
            startActivity(intent)
            finish()
        })



        upload1.setOnClickListener(View.OnClickListener {

            startActivityForResult(
                Intent(
                    Intent.ACTION_PICK,
                    MediaStore.Images.Media.INTERNAL_CONTENT_URI
                ), GET_FROM_GALLERY
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
                            this@IDVerificationActivity.getContentResolver(),
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
