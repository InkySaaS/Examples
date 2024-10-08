package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.FrameLayoutExampleBinding
import android.widget.Toast
import java.util.*

class FrameLayoutExample : AppCompatActivity() {

    private lateinit var binding: FrameLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FrameLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAaa.setOnClickListener {
            geeg()
        }
    }

    private fun geeg() {
        val rand = Random()
        val num = rand.nextInt(11)
        val autism = when (num) {
            0 -> "\uD83D\uDE35\u200D\uD83D\uDCAB"
            1 -> "\uD83D\uDE00"
            2 -> "\uD83D\uDE22"
            3 -> "\uD83D\uDE15"
            4 -> "\uD83D\uDE09"
            5 -> "\uD83D\uDE21"
            6 -> "\uD83E\uDD28"
            7 -> "\uD83E\uDEE2"
            8 -> "\uD83D\uDE42\u200D↔\uFE0F"
            9 -> "\uD83E\uDD2B"
            else -> "\uD83D\uDE2A"
        }

        val toast = Toast.makeText(this, autism, Toast.LENGTH_LONG)
        toast.show()
    }
}