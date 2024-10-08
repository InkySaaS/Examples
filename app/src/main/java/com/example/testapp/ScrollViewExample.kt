package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ScrollviewExampleBinding
import android.widget.Button
import android.widget.Toast
import android.view.Gravity

class ScrollViewExample: AppCompatActivity() {

    private lateinit var binding: ScrollviewExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ScrollviewExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYes.setOnClickListener {
            Toast.makeText(this, "Tá bom", Toast.LENGTH_SHORT).show()
        }

        binding.buttonNo.setOnClickListener {
            Toast.makeText(this, ":(", Toast.LENGTH_SHORT).show()
        }
    }
}