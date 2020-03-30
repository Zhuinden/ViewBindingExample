package com.zhuinden.viewbindingexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.zhuinden.viewbindingexample.databinding.FirstFragmentBinding
import com.zhuinden.viewbindingexample.databinding.SecondFragmentBinding

class SecondFragment: Fragment(R.layout.second_fragment) {
    private val binding by viewBinding(SecondFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonPressMe.onClick {
            showToast("hello second fragment button click!")
        }
    }
}