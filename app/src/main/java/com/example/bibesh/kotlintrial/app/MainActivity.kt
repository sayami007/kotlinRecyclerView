package com.example.bibesh.kotlintrial.app


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.*
import com.example.bibesh.kotlintrial.adapter.CustomRecyclerAdapter
import com.example.bibesh.kotlintrial.R
import com.example.bibesh.kotlintrial.`interface`.ClickListener


class MainActivity : AppCompatActivity(), ClickListener {
    override fun clickListener(position: Int) {
        print("HELLO")
        println(position)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvMain: RecyclerView = findViewById(R.id.rv_main)

        var layoutManager: LinearLayoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        rvMain.layoutManager = layoutManager

        var rvAdapter: CustomRecyclerAdapter = CustomRecyclerAdapter(this, getName(), this)
        rvMain.adapter = rvAdapter
    }

    fun getName(): ArrayList<String> {
        val arrayList: ArrayList<String> = ArrayList<String>()
        arrayList.add("BIBESH")
        arrayList.add("Binod")
        arrayList.add("Bishow")
        arrayList.add("Bikesh")
        arrayList.add("BIBESH")
        arrayList.add("Binod")
        arrayList.add("Bishow")
        arrayList.add("Bikesh")
        arrayList.add("BIBESH")
        arrayList.add("Binod")
        arrayList.add("Bishow")
        arrayList.add("Bikesh")
        return arrayList
    }
}
