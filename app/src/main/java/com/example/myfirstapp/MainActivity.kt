package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById<Button>(R.id.button1)
        val myEditText : EditText = findViewById<EditText>(R.id.editText1)
        val myTextView : TextView = findViewById<TextView>(R.id.textView)

        var myString : String

        myEditText.setOnClickListener {
            myEditText.setText("")
        }

        myButton.setOnClickListener {
            myString = myEditText.text.toString()
            if (myString == ""){
                myTextView.text = "Ingresa un Nombre"
            }
            else{
                myTextView.text = "Hello " + myString
            }
        }
    }
}