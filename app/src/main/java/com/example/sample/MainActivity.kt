package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //funny
        var answ=0.01
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Completed!", Toast.LENGTH_SHORT)
            toast.show()
            val final: TextView = findViewById(R.id.textView6)
            val a: TextView = findViewById(R.id.editText); val a1=Integer.parseInt( a.getText().toString());
            val b: TextView = findViewById(R.id.editText1)
            val c: TextView = findViewById(R.id.editText2)
            val d: TextView = findViewById(R.id.editText3)

            final.text = "$a1"


        }


    }
}