package com.mike.shaurma

import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    lateinit var secondactivityButton: Button

    lateinit var randomnumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        secondactivityButton = findViewById(R.id.buttonSecondScreen)
        secondactivityButton.setOnClickListener {
            val secondActivityIntent: Intent = Intent(this, SecondScreen::class.java)
            startActivity(secondActivityIntent)
        }

        buttonlink.setOnClickListener {
            val doublegis = Uri.parse("https://2gis.ru/elabuga/firm/70000001031627914")
            val openURL = Intent(Intent.ACTION_VIEW, doublegis)
            startActivity(openURL)
        }


        //Random.nextInt().toString(), Toast.LENGTH_LONG).show()

        randomnumber = findViewById(R.id.randomnum)
        randomnumber.setOnClickListener() {
           val text = Random.nextInt(1, 32).toString()
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()


        }

    }
}