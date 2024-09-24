package com.example.cc17_3f_cayabyabic_act3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val rollButtonMA: Button = findViewById(R.id.buttom_am)
        rollButtonMA.setOnClickListener{
            rollDiceMA()

//            val textViewMA: TextView = findViewById(R.id.textviewAM)
//            textViewMA.text = "4"


        }
    }

    private fun rollDiceMA() {
        val diceMA = DiceMA(6)
        val cubeRoll = diceMA.rollMA()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice__6_)

        when (cubeRoll) {
        1 -> diceImage.setImageResource(R.drawable.dice__1_)
        2 -> diceImage.setImageResource(R.drawable.dice__2_)
        3 -> diceImage.setImageResource(R.drawable.dice__3_)
        4 -> diceImage.setImageResource(R.drawable.dice__4_)
        5 -> diceImage.setImageResource(R.drawable.dice__5_)
        6 -> diceImage.setImageResource(R.drawable.dice__6_)
        }
    }


    class DiceMA (val numSidesMa: Int ){
        fun rollMA (): Int {
            return (1..numSidesMa).random()

        }

    }
}