package com.example.pace


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_payment.*

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


        val txtInterestRate=view.findViewById<TextView>(R.id.txtInterestRate)
        val txtPrice=view.findViewById<TextView>(R.id.txtPrice)
        val txtDownPayment=view.findViewById<TextView>(R.id.txtDownPayment)
        val txtTotalIncome=view.findViewById<TextView>(R.id.txtTotalIncome)

        val txtPropertyTaxes=view.findViewById<TextView>(R.id.txtPropertyTaxes)

        val seek2 = view.findViewById<SeekBar>(R.id.seekBar2)
        val seek = view.findViewById<SeekBar>(R.id.seekBar)
        val seek1 = view.findViewById<SeekBar>(R.id.seekBar1)


        val txtPrincipalInterest=view.findViewById<TextView>(R.id.txtPrincipalInterest)


        seek2?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                // write custom code for progress is changed
                txtInterestRate.text="$progress"
                val amount:Int=progress*8
                    txtPrincipalInterest.text=amount.toString()


            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                // write custom code for progress is started

            }

            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped



            }
        })



        seek1?.setOnSeekBarChangeListener(object :
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
                // write custom code for progress is changed
                txtDownPayment.text = "$progress"

                val amount:Int=progress*100
                txtTotalIncome.text=amount.toString()



            }
        })





        seek?.setOnSeekBarChangeListener(object :
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
                // write custom code for progress is changed
                txtDownPayment.text = "$progress"





            }
        })



        seek?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
               //To change body of created functions use File | Settings | File Templates.
            }

            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                // write custom code for progress is changed

                txtPrice.text = "$progress"
                val amount:Int=progress/25
                txtPropertyTaxes.text=amount.toString()


            }
        })




        return view
    }





}
