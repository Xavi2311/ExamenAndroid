package com.example.examen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val mDataSet: List<Alumne>) : RecyclerView.Adapter<MyViewHolder>() {


    class ViewHolder(var textView: TextView) : RecyclerView.ViewHolder(textView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.frame_layout, parent, false) as TextView

        return ViewHolder(v)
    }

    override fun getItemCount() = mDataSet.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = mDataSet[position].toString()
    }
}


class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.fragmentLlista)
}
