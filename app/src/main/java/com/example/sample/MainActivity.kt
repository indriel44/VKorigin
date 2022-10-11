package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt
import kotlin.math.atan

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //funny
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Completed!", Toast.LENGTH_SHORT)
            toast.show()
            val final: TextView = findViewById(R.id.textView6)
            val a: TextView = findViewById(R.id.editText); val a1=Integer.parseInt( a.getText().toString())*1000;
            val b: TextView = findViewById(R.id.editText2); val b1=Integer.parseInt( b.getText().toString())*1000;
            val c: TextView = findViewById(R.id.editText1); val c1=Integer.parseInt( c.getText().toString())*1000;
            val d: TextView = findViewById(R.id.editText3); val d1=Integer.parseInt( d.getText().toString())*1000;
           val a2=(a1-c1).toDouble(); val d2=(a2-d1/1000).toDouble(); val b2=b1.toDouble()
           val answ=360*atan((sqrt(a2*a2+b2*b2-d2*d2)-b2)/(a2+d2))/3.1415
            final.text = "${answ}"
        }
    }
}