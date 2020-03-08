package com.example.pace.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pace.AffordabilityFragment
import com.example.pace.PaymentFragment
import com.example.pace.R
import kotlinx.android.synthetic.main.activity_mortgage__calculator.*

class Mortgage_Calculator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mortgage__calculator)


        backarrowmortgage.setOnClickListener(View.OnClickListener {
            finish()
        })





        if(savedInstanceState==null){

            val fragment=PaymentFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container11, fragment)
            transaction.commit()
            payment.setTextColor(resources.getColor(R.color.colorAccent))
            affordability.setTextColor(resources.getColor(R.color.saved))

            paymentLayoutUnderline.setBackgroundColor((resources.getColor(R.color.colorAccent)))
            affordabilityLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
        }

        payment.setOnClickListener(View.OnClickListener {

            val fragment=PaymentFragment()
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container11,fragment)
            transaction.commit()

            payment.setTextColor(resources.getColor(R.color.colorAccent))
            affordability.setTextColor(resources.getColor(R.color.saved))

            paymentLayoutUnderline.setBackgroundColor((resources.getColor(R.color.colorAccent)))
            affordabilityLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))


        })


        affordability.setOnClickListener(View.OnClickListener {

            val fragment=AffordabilityFragment()
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container11,fragment)
            transaction.commit()

            payment.setTextColor(resources.getColor(R.color.saved))
            affordability.setTextColor(resources.getColor(R.color.colorAccent))

            paymentLayoutUnderline.setBackgroundColor((resources.getColor(R.color.underline)))
            affordabilityLayoutUnderline.setBackgroundColor((resources.getColor(R.color.colorAccent)))


        })





    }
}
