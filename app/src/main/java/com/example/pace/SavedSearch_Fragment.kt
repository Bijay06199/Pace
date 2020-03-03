package com.example.pace


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class SavedSearch_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_saved_searches, container, false)

        val savedsearchSaved =v.findViewById<TextView>(R.id.savedsearchSaved)

        savedsearchSaved.setOnClickListener(View.OnClickListener {

            val fragment= SavedSearch_Saved_Fragment()

            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container1, fragment)
           // fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        })
        return v
    }


}
