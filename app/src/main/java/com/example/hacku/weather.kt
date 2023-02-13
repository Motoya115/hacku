package com.example.hacku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class weather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        //1)listviewの取得
        val weather: ListView =findViewById(R.id.weather)
        val wdata= arrayOf("晴れ","曇り","雨","雪")

        //2)アダプター
        val adapter= ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            wdata
        )
        //3)アダプターをリストビューにセット
        weather.adapter=adapter

        //4クリックして次のページ
        weather.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, style::class.java)
            startActivity(intent)
         }
        }
    }

