package com.example.latsodoanhinh.view.home

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.latsodoanhinh.R
import com.example.latsodoanhinh.baseView.BaseActivity
import com.example.latsodoanhinh.databinding.ActivityDemoBinding
import com.example.latsodoanhinh.databinding.ActivityHomeBinding

class DemoActivity : BaseActivity() {
    private lateinit var binding: ActivityDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDemoBinding.inflate(layoutInflater)
        applyWindow(binding.root)
        setContentView(binding.root)
        onClick()
    }

    private fun onClick() {
    }
}