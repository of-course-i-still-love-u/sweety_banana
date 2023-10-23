package com.example.valofragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.valofragment.databinding.FragmentSageBinding
import com.example.valofragment.databinding.FragmentSovaBinding

class SageFragment:Fragment() {
    private lateinit var sageBinding:FragmentSageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.sageBinding = FragmentSageBinding.inflate(inflater,container,false)
        return this.sageBinding.root
    }

}