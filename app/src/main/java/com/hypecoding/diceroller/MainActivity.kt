package com.hypecoding.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rolButton : Button = findViewById(R.id.roll_button)
        diceImage=findViewById(R.id.dice_image)
        rolButton.text="lets Roll"
        rolButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomImageResources = Random().nextInt(6)+1
        val drawableResources = when(randomImageResources){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResources)
    }
}
