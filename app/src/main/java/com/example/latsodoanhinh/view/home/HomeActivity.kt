package com.example.latsodoanhinh.view.home

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.latsodoanhinh.baseView.BaseActivity
import com.example.latsodoanhinh.databinding.ActivityHomeBinding
import com.example.latsodoanhinh.viewModel.HomeViewModel

class HomeActivity : BaseActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        applyWindow(binding.root)
        setContentView(binding.root)
        observable()
        onClick()
    }

    private fun observable() {
        viewModel.resultText.observe(this) { newText ->
            binding.tvResult.text = newText
        }

        viewModel.isLoading.observe(this) { isLoading ->
            if (isLoading) {
                binding.progressBar.visibility = View.VISIBLE
                binding.tvSimulator.isEnabled = false
            } else {
                binding.progressBar.visibility = View.GONE
                binding.tvSimulator.isEnabled = true
            }
        }
    }

    private fun onClick() {
        binding.tvSimulator.setOnClickListener {
            viewModel.simulateDataLoading()
        }
    }
}