package com.foodominc.kotlinrecyclerview.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodominc.kotlinrecyclerview.R
import com.foodominc.kotlinrecyclerview.model.SampleData
import kotlinx.android.synthetic.main.one_item_layout.view.*

class SampleDataAdapter(var sampledataList:ArrayList<SampleData>) :
    RecyclerView.Adapter<SampleDataAdapter.SampleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.one_item_layout,parent,false)

        return SampleViewHolder(view)
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        val sdata=sampledataList[position]
        holder.bind(sdata)

        Log.i("SampleAdapter####",""+position)
    }

    override fun getItemCount(): Int {
       return sampledataList.size
    }

    class SampleViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)
    {
        fun bind(sampleData:SampleData){
            itemView.textView.text=sampleData.name
            itemView.textView2.text=sampleData.age.toString()
        }
    }

}