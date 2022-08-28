package com.example.finalpro.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalpro.R
import com.example.finalpro.SecFragment
import com.example.finalpro.model.flavormodel

class  adaptersecound(private val dataset:List<flavormodel>, private val context: com.example.finalpro.SecFragment)
    : RecyclerView.Adapter< adaptersecound.appViewHolder>() {


    class appViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.itemtitle)
        val imageView : ImageView = view.findViewById(R.id.itemimage)

    }//end class appViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): appViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent,false)



        return appViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: appViewHolder, position: Int) {
        val item=dataset[position]
        holder.textView.text=context.resources.getString(item.appStringId)
        holder.imageView.setImageResource(item.appImageId)




    }




    override fun getItemCount() = dataset.size


}//end class