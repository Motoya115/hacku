package com.example.hacku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class style : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style)
        //1)listviewの取得
        val style: ListView =findViewById(R.id.style)
        val stdata= arrayOf("アメカジ","古着","ストリート","きれいめ","ミリタリー","ロック")

        //2)アダプター
        val adapter= ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            stdata
        )
        //3)アダプターをリストビューにセット
        style.adapter=adapter

        //4クリックして次のページ
        style.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, answer::class.java)
            startActivity(intent)
        }
    }
}