package com.example.pace


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.pace.Activity.*
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_user.*

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


        val txtShare=v.findViewById<TextView>(R.id.textShare)
        val txtsettings= v.findViewById<TextView>(R.id.txtsettings)
        val iconsettinguser= v.findViewById<ImageView>(R.id.iconsettinguser)
        val txtmortgagecalculator=v.findViewById<TextView>(R.id.txtmortgagecalculator)
        val txtlogoutMortgage=v.findViewById<TextView>(R.id.txtLogoutMortgage)
        val txtProfile=v.findViewById<TextView>(R.id.txtProfile)

        iconsettinguser.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@User_fragment.activity, SettingsActivity::class.java)
            startActivity(intent)
        })

        txtsettings.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@User_fragment.activity, SettingsActivity::class.java)
            startActivity(intent)
        })

        txtShare.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@User_fragment.activity,ShareActivity::class.java)
            startActivity(intent)
        })


        txtmortgagecalculator.setOnClickListener(View.OnClickListener {

            val intent=Intent(this@User_fragment.activity,Mortgage_Calculator::class.java)
            startActivity(intent)
            clearFindViewByIdCache()
        })

        txtProfile.setOnClickListener(View.OnClickListener {

            val intent=Intent(this@User_fragment.activity,MyProfileActivity::class.java)
            startActivity(intent)
            clearFindViewByIdCache()
        })



        txtlogoutMortgage.setOnClickListener(View.OnClickListener {

            val intent=Intent(this@User_fragment.activity,MainActivity::class.java)
            startActivity(intent)


        })


        return v
    }


}
