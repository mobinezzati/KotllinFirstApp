package com.example.mobin.kotllinfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    //    var buttonAccept: Button = findViewById(R.id.btn_calc);
//    var buttonNum1: Button = findViewById(R.id.btn_1);
//    var buttonNum2: Button = findViewById(R.id.btn_2);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext.setOnClickListener {

             var myIntent = Intent(this , SecondActivity::class.java)
            myIntent.putExtra("studentNumber" , editText_student_number.text.toString())
            startActivity(myIntent)



        }
    }
}