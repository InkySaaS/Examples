package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.RelativeLayoutExampleBinding
import android.widget.TextView

class RelativeLayoutExample: AppCompatActivity() {

    private lateinit var binding: RelativeLayoutExampleBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = RelativeLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLol.setOnClickListener {
            textin(
                this,
                binding.textChange
            )
        }
    }

    private fun textin(context: RelativeLayoutExample, textchange: TextView) {
        var adhd = "Pachirisu em competições: usa alta velocidade para ser \"lead\", movimentos elétricos como Volt Switch e Thunderbolt, e combinações ofensivas ou de suporte. Foi destaque no campeonato mundial de 2014. É versátil e controla o fluxo da batalha com rapidez e eficácia."

        textchange.text = adhd
    }
}