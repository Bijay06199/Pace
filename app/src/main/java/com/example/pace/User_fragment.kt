package com.example.pace


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.pace.Activity.SettingsActivity
import com.example.pace.Activity.ShareActivity

/**
 * A simple [Fragment] subclass.
 */
class User_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_user, container, false)


        val txtShare=v.findViewById<TextView>(R.id.txtShare)
        val imgShare= v.findViewById<ImageView>(R.id.imgShare)
        val iconsettinguser= v.findViewById<ImageView>(R.id.iconSettinguser)

        iconsettinguser.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@User_fragment.activity, SettingsActivity::class.java)
            startActivity(intent)
        })

        txtShare.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@User_fragment.activity,ShareActivity::class.java)
            startActivity(intent)
        })



        imgShare.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@User_fragment.activity,ShareActivity::class.java)
            startActivity(intent)

        })

        return v
    }


}
