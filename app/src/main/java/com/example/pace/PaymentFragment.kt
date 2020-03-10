package com.example.pace


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_settings.view.*
import kotlinx.android.synthetic.main.fragment_payment.*
import kotlinx.android.synthetic.main.fragment_payment.view.*
import kotlinx.android.synthetic.main.fragment_user.*

/**
 * A simple [Fragment] subclass.
 */
 class PaymentFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view= inflater.inflate(R.layout.fragment_payment, container, false)









        val txtTotalIncome=view.findViewById<TextView>(R.id.txtTotalIncome)


        val txtInterestRate=view.findViewById<TextView>(R.id.txtInterestRate)
        val txtPropertyTaxes=view.findViewById<TextView>(R.id.txtPropertyTaxes)
        val txtHomeInsurance=view.findViewById<TextView>(R.id.txtHomeInsurance)
        val txtMortgageInsurance=view.findViewById<TextView>(R.id.txtMortgageInsurance)



        val txtPrice=view.findViewById<TextView>(R.id.txtPrice)
        val txtDownPayment=view.findViewById<TextView>(R.id.txtDownPayment)




        val seekPrice = view.findViewById<SeekBar>(R.id.seekPrice)
        val seekInterestRate = view.findViewById<SeekBar>(R.id.seekInterestRate)
        val seekDownPayment = view.findViewById<SeekBar>(R.id.seekDownPayment)


        val txtPrincipalInterest=view.findViewById<TextView>(R.id.txtPrincipalInterest)


        val imgPrice=view.findViewById<EditText>(R.id.imgPrice)
        val imgDownPayment=view.findViewById<EditText>(R.id.imgDownpayment)
        val imgInterestRate=view.findViewById<EditText>(R.id.imgInterestRate)





        imgPrice.setOnClickListener(View.OnClickListener {

            txtPrice.text=imgPrice.text


        })

        imgDownPayment.setOnClickListener(View.OnClickListener {
            txtDownPayment.text=imgDownPayment.text
        })

        imgInterestRate.setOnClickListener(View.OnClickListener {
            txtInterestRate.setOnClickListener(View.OnClickListener {
                txtInterestRate.text=imgInterestRate.text
            })
        })


        seekPrice?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                // write custom code for progress is changed
               // txtInterestRate.text="$progress"
                txtPrice.text="$progress"
                txtDownPayment.text="${progress/8}"
                txtInterestRate.text="${progress/100}"
                txtPrincipalInterest.text="${progress*10}"
                txtPropertyTaxes.text="${progress*15}"
                txtHomeInsurance.text="${progress/10}"
                txtMortgageInsurance.text="${progress*90}"
                txtTotalIncome.text="${progress/7}"





            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                // write custom code for progress is started

            }

            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped



            }
        })



        seekInterestRate?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
             //To change body of created functions use File | Settings | File Templates.
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
               //To change body of created functions use File | Settings | File Templates.
            }

            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                txtPrice.text="$progress"
                txtDownPayment.text="${progress/8}"
                txtInterestRate.text="${progress/100}"
                txtPrincipalInterest.text="${progress*10}"
                txtPropertyTaxes.text="${progress*15}"
                txtHomeInsurance.text="${progress/10}"
                txtMortgageInsurance.text="${progress*90}"
                txtTotalIncome.text="${progress/7}"


            }
        })





        seekDownPayment?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
             //To change body of created functions use File | Settings | File Templates.
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
               //To change body of created functions use File | Settings | File Templates.
            }

            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                txtPrice.text="$progress"
                txtDownPayment.text="${progress/8}"
                txtInterestRate.text="${progress/100}"
                txtPrincipalInterest.text="${progress*10}"
                txtPropertyTaxes.text="${progress*15}"
                txtHomeInsurance.text="${progress/10}"
                txtMortgageInsurance.text="${progress*90}"
                txtTotalIncome.text="${progress/7}"




            }
        })

        return view
    }





}
