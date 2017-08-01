package com.example.bibesh.kotlintrial.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import com.example.bibesh.kotlintrial.R
import com.example.bibesh.kotlintrial.`interface`.ClickListener

/**
 * Created by Bibesh on 8/1/17.
 */


class CustomRecyclerAdapter(ctx: Context, list: ArrayList<String>, clickListener: ClickListener) : RecyclerView.Adapter<CustomRecyclerAdapter.CustomViewHolder>() {

    val list: ArrayList<String> = list
    val ctx: Context = ctx
    val inflater: LayoutInflater = LayoutInflater.from(ctx)
    val clickListener: ClickListener? = clickListener

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        if (holder != null) {
            holder.tvSingle.text = list.get(position)
            holder.tvSingle.setOnClickListener {
                clickListener?.clickListener(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val v: View = inflater.inflate(R.layout.single_item, parent, false)
        val holder: CustomViewHolder = CustomViewHolder(v)
        return holder
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class CustomViewHolder : RecyclerView.ViewHolder {
        val tvSingle: TextView = itemView.findViewById(R.id.tv_single)

        constructor(itemView: View?) : super(itemView)
    }
}