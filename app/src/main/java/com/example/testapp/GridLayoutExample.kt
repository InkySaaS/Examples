package com.example.testapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.GridLayoutExampleBinding
import android.widget.Button
import android.widget.Toast
import android.view.Gravity

class GridLayoutExample: AppCompatActivity() {

    private lateinit var binding: GridLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GridLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.grid_layout_example)

        val button69: Button = findViewById(R.id.button69)

        button69.setOnClickListener {
            val location = IntArray(2)
            button69.getLocationOnScreen(location)
            val x = location[0]
            val y = location[0]
            val toast = Toast.makeText(this, "CURSE OF RA \uD80C\uDC00 \uD80C\uDC01 \uD80C\uDC02 \uD80C\uDC03 \uD80C\uDC04 \uD80C\uDC05 \uD80C\uDC06 \uD80C\uDC07 \uD80C\uDC08 \uD80C\uDC09 \uD80C\uDC0A \uD80C\uDC0B \uD80C\uDC0C \uD80C\uDC0D \uD80C\uDC0E \uD80C\uDC0F \uD80C\uDC10 \uD80C\uDC11 \uD80C\uDC12 \uD80C\uDC13 \uD80C\uDC14 \uD80C\uDC15 \uD80C\uDC16 \uD80C\uDC17 \uD80C\uDC18 \uD80C\uDC19 \uD80C\uDC1A \uD80C\uDC1B \uD80C\uDC1C \uD80C\uDC1D \uD80C\uDC1E \uD80C\uDC1F \uD80C\uDC20 \uD80C\uDC21 \uD80C\uDC22 \uD80C\uDC23 \uD80C\uDC24 \uD80C\uDC25 \uD80C\uDC26 \uD80C\uDC27 \uD80C\uDC28 \uD80C\uDC29 \uD80C\uDC2A \uD80C\uDC2B \uD80C\uDC2C \uD80C\uDC2D \uD80C\uDC2E \uD80C\uDC2F \uD80C\uDC30 \uD80C\uDC31 \uD80C\uDC32 \uD80C\uDC33 \uD80C\uDC34 \uD80C\uDC35 \uD80C\uDC36 \uD80C\uDC37 \uD80C\uDC38 \uD80C\uDC39 \uD80C\uDC3A \uD80C\uDC3B \uD80C\uDC3C \uD80C\uDC3D \uD80C\uDC3E \uD80C\uDC3F \uD80C\uDC40 \uD80C\uDC41 \uD80C\uDC42 \uD80C\uDC43 \uD80C\uDC44 \uD80C\uDC45 \uD80C\uDC46 \uD80C\uDC47 \uD80C\uDC48 \uD80C\uDC49 \uD80C\uDC4A \uD80C\uDC4B \uD80C\uDC4C \uD80C\uDC4D \uD80C\uDC4E \uD80C\uDC4F \uD80C\uDC50 \uD80C\uDC51 \uD80C\uDC04 \uD80C\uDC05 \uD80C\uDC06", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.END, x, y)
            toast.show()
        }
    }
}