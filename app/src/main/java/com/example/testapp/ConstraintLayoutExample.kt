package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ConstraintLayoutExampleBinding
import android.content.Context
import android.widget.TextView
import java.util.*

class ConstraintLayoutExample: AppCompatActivity() {

    private lateinit var binding: ConstraintLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ConstraintLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            generateNumbers(
                this,
                binding.textViewAdhd
            )
        }
    }

    private fun generateNumbers(context: Context, textViewAdhd: TextView) {
        val rand = Random()
        val autism = IntArray(20)
        var ocd = "Vetor gerado:\n"
        var adhd = "Números divisíveis por 5:\n"

        for (i in autism.indices) {
            autism[i] = rand.nextInt(51)
            if (autism[i] % 5 == 0) {
                adhd += "${autism[i]} - "
            }
        }

        textViewAdhd.text = adhd
    }
}
