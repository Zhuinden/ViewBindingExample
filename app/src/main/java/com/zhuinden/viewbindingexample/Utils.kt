package com.zhuinden.viewbindingexample

import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

fun View.onClick(clickListener: (View) -> Unit) {
    setOnClickListener(clickListener)
}

fun Fragment.showToast(text: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(requireContext(), text, length).show()
}