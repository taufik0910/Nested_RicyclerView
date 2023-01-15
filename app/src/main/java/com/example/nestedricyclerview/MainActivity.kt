package com.example.nestedricyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nestedricyclerview.adapter.MainAdapter
import com.example.nestedricyclerview.databinding.ActivityMainBinding
import com.example.nestedricyclerview.utils.SampleData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMain.adapter= MainAdapter(SampleData.collections)
        }
    }
}