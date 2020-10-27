package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ComputeActivity : AppCompatActivity() {
    private lateinit var champ1: EditText
    private lateinit var champ2: EditText
    private lateinit var calculButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compute_activity)
        calculButton = findViewById(R.id.btn_calculer)

        calculButton.setOnClickListener {
            champ1 = findViewById(R.id.field_1)
            champ2 = findViewById(R.id.field_2)
            val nb1: Double = champ1.text.toString().toDouble()
            val nb2: Double = champ2.text.toString().toDouble()
            val result: Double = nb1 + nb2
            Toast.makeText(baseContext, "La somme de $nb1 + $nb2 est $result ", Toast.LENGTH_LONG)
                .show()
            val TextCount = "La somme de $nb1 + $nb2 est $result"
            calculButton.text = TextCount
        }

    }


}

