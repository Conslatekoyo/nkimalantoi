package dev.conslate.fibonancciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class NumberRecyclerViewAdapter (var numberlist:List<Int>):RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView  = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_item, parent, false)
        return  NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumber.text = numberlist.get(position).toString()
    }

    override fun getItemCount(): Int {
      return numberlist.size
    }

}

class NumberViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}