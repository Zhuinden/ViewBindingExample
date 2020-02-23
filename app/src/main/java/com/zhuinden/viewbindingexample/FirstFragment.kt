package com.zhuinden.viewbindingexample

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.zhuinden.viewbindingexample.databinding.FirstFragmentBinding
import java.lang.Exception

class FirstFragment: Fragment(R.layout.first_fragment) {
    private val binding by viewBinding(FirstFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonPressMe.onClick {
            showToast("Hello binding!")
        }
    }
}