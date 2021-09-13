package com.example.companyxdashboard

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView





class MainActivity : AppCompatActivity() {
    var bankingcard: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bankingcard = findViewById<View>(R.id.card_app) as CardView?
        bankingcard?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(applicationContext, My_Profile::class.java)
                startActivity(intent)
            }
        })



    }
}