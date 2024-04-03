package com.example.assigment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity(){

private val historicFigures = mapOf(
78 to "Mahatma Gandhi",
    56 to "Adolf Hitler",
    76 to "Albert Einstein",
    52 to "William Shakespeare",
    84 to "Isaac Newton",
    55 to "Christopher Columbus",
    39 to "Martin Luther King jr",
    81 to "Queen Victoria",
    67 to "Leonardo da Vinci",
    56 to "Abraham Lincoln",
)


override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextText = findViewById<EditText>(R.id.editTextText)
        val button3 = findViewById<Button>(R.id.button3)
        val textView = findViewById<TextView>(R.id.textView)
        val button4 = findViewById<Button>(R.id.button4)
    val textView2 = findViewById<TextView>(R.id.textView2)
    button4.setOnClickListener {
        editTextText.text.clear()

        button3.setOnClickListener {
           val age = editTextText.text.toString().toIntOrNull()
           age?.let {
               val figure = historicFigures[age]
               if (figure != null) {
                   textView2.text = "You share the same $age as $figure."
               } else {
                   textView2.text ="There is no historical figures in our records who was $age years old."

               }
           } ?: run {
               textView2.text= "Please enter  valid age"
           }
       }




    }
}
    }