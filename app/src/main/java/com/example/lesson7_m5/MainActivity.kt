package com.example.lesson7_m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson7_m5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val math = Math()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
        clear()
    }

    private fun setupListeners() {
        binding.add.setOnClickListener {
            result(math.add(binding.calcFirstEdt.text.toString(),binding.calcSecondEdt.text.toString()))
        }

        binding.btnDivide.setOnClickListener {
            result(math.divide(binding.calcFirstEdt.text.toString(),binding.calcSecondEdt.text.toString()))
        }
        binding.btnMinus.setOnClickListener {
            result(math.minus(binding.calcFirstEdt.text.toString(), binding.calcSecondEdt.text.toString()))
        }
        binding.btnMultiply.setOnClickListener {
            result(math.multiply(binding.calcFirstEdt.text.toString(),binding.calcSecondEdt.text.toString()))
        }
    }
    private fun result(toString: String) {
        binding.calcResultTv.text = toString
    }

    private fun clear(){
        binding.btnClear.setOnClickListener {
            binding.calcFirstEdt.setText("")
            binding.calcSecondEdt.setText("")
            binding.calcResultTv.setText("")
        }
    }
}