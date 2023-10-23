package com.example.valofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.valofragment.databinding.ActivityMainBinding
import com.example.valofragment.databinding.FragmentSageBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.buttonNext.setOnClickListener {
            when (supportFragmentManager.backStackEntryCount) {
                0 -> replaceFragment(SageFragment(), "sageFragment")
                1 -> replaceFragment(ReynaFragment(), "reynaFragment")
                else -> supportFragmentManager.popBackStack(
                    "sageFragment",
                    FragmentManager.POP_BACK_STACK_INCLUSIVE
                )
            }
        }
    }

    private fun replaceFragment(fragment: Fragment, fragmentName: String): Int {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out
            )
            .replace(R.id.fragment_container_view_main, fragment, fragmentName)
            .addToBackStack(fragmentName)
            .commit()
        return supportFragmentManager.backStackEntryCount

    }

}