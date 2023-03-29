package com.perlera.laboratorio_03m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCents: ImageView
    private lateinit var tenCents: ImageView
    private lateinit var quarerCoin: ImageView
    private lateinit var dollarCoin: ImageView
    private lateinit var cashTextView: TextView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addEventListener()
    }

    fun bind(){
        fiveCents = findViewById(R.id.fivecentes_image_view)
        tenCents = findViewById(R.id.tencents_image_view)
        quarerCoin = findViewById(R.id.quarer_image_view)
        dollarCoin = findViewById(R.id.dollar_image_view)
        cashTextView = findViewById(R.id.cash_text_view)
    }

    fun addEventListener(){
        fiveCents.setOnClickListener(){
            cash += 0.05
            cash = String.format("%.2f",cash).toDouble()

            cashTextView.text = "$${cash}"
        }

        tenCents.setOnClickListener(){
            cash += 0.10
            cash = String.format("%.2f",cash).toDouble()

            cashTextView.text = "$${cash}"
        }

        quarerCoin.setOnClickListener(){
            cash += 0.25
            cash = String.format("%.2f",cash).toDouble()

            cashTextView.text = "$${cash}"
        }

        dollarCoin.setOnClickListener(){
            cash += 1.00
            cash = String.format("%.2f",cash).toDouble()

            cashTextView.text = "$${cash}"
        }
    }
}