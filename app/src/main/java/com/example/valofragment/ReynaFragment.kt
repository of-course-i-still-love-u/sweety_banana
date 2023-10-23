package com.example.valofragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.valofragment.databinding.FragmentReynaBinding
import com.example.valofragment.databinding.FragmentSageBinding
import com.example.valofragment.databinding.FragmentSovaBinding

class ReynaFragment:Fragment() {
    private lateinit var reynaFragment:FragmentReynaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.reynaFragment = FragmentReynaBinding.inflate(inflater,container,false)
        return this.reynaFragment.root
    }

}