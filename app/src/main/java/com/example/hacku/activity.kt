package com.example.hacku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_)

        //1)listviewの取得
        val season:ListView=findViewById(R.id.season)
        val sdata= arrayOf("春","夏","秋","冬")

        //2)アダプター
        val adapter=ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            sdata
        )
        //3)アダプターをリストビューにセット
        season.adapter=adapter

        //4クリックして次のページ
        season.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, weather::class.java)
            startActivity(intent)
        }
    }
}