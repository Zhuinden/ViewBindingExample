package com.zhuinden.viewbindingexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.zhuinden.viewbindingexample.databinding.FirstFragmentBinding

class FirstFragment: Fragment(R.layout.first_fragment) {
    private val binding by viewBinding(FirstFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonPressMe.onClick {
            showToast("hello fragment button click!")
        }
    }
}