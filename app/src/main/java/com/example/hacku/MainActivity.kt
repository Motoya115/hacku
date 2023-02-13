package com.example.hacku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)Viewの取得
        val btnStart : Button = findViewById(R.id.btnstart)

        //2)ボタンを押したら次の画面へ
        
        btnStart.setOnClickListener {
            val intent = Intent(this, activity::class.java)
            startActivity(intent)
        }
    }
}