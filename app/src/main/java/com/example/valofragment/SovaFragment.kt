package com.example.valofragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.valofragment.databinding.FragmentSovaBinding

class SovaFragment:Fragment() {
    private lateinit var sovaBinding: FragmentSovaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.sovaBinding = FragmentSovaBinding.inflate(inflater,container,false)
        return this.sovaBinding.root
    }

}