package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var clickButton: Button
    private var nbClick = 0
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickButton = findViewById(R.id.btn_click_me)
        textView = findViewById(R.id.textView_count)
        clickButton.setOnClickListener {
            nbClick++
            Toast.makeText(baseContext, "Tu m'as cliqué $nbClick fois", Toast.LENGTH_LONG).show()
            val newText = "Cliquez moi $nbClick"
            clickButton.text = newText
            if(nbClick == 0){

            }
            else{
                if (nbClick >4){
                    clickButton.isEnabled=false;
                }
                textView.text = "Vous avez cliqué $nbClick fois"
            }





        }


    }


}