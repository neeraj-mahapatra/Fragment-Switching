package com.example.fragmentbackapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button2 = view.findViewById<Button>(R.id.button3)

        button2.setOnClickListener {
            val fragment4 = Fragment4()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.flframe, fragment4)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}