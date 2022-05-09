package com.example.myapplication1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication1.R
import com.example.myapplication1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var num = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView = root.findViewById<TextView>(R.id.text_home)
        val btn = root.findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            num++
            textView.text = num.toString()
        }
        textView.text = num.toString()
        return root
    }
}