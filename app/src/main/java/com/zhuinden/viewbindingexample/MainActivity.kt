package com.zhuinden.viewbindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhuinden.viewbindingexample.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(MainActivityBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.onClick {
            showToast("hello activity button click!")
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, FirstFragment(), "FirstFragment")
                .commit()
        }
    }
}
