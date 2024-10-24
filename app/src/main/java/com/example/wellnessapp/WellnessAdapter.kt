package com.example.wellnessapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysapp.WellnessTip


class WellnessAdapter(private val wellnessTipList: List<WellnessTip>) :
    RecyclerView.Adapter<WellnessAdapter.WellnessViewHolder>() {

    class WellnessViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayText: TextView = itemView.findViewById(R.id.dayText)
        val daySummary: TextView = itemView.findViewById(R.id.daySummary)
        val dayDescription: TextView = itemView.findViewById(R.id.dayDescription)
        val dayImage: ImageView = itemView.findViewById(R.id.dayImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WellnessViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return WellnessViewHolder(view)
    }

    override fun onBindViewHolder(holder: WellnessViewHolder, position: Int) {
        val tip = wellnessTipList[position]
        holder.dayText.text = "Day ${tip.day}"
        holder.daySummary.text = tip.summary
        holder.dayDescription.text = tip.description
        holder.dayImage.setImageResource(tip.imageResource)

        val dayColor = when (position % 30 + 1) { // To cycle through 1-30
            1 -> R.color.day1
            2 -> R.color.day2
            3 -> R.color.day3
            4 -> R.color.day4
            5 -> R.color.day5
            6 -> R.color.day6
            7 -> R.color.day7
            8 -> R.color.day8
            9 -> R.color.day9
            10 -> R.color.day10
            11 -> R.color.day11
            12 -> R.color.day12
            13 -> R.color.day13
            14 -> R.color.day14
            15 -> R.color.day15
            16 -> R.color.day16
            17 -> R.color.day17
            18 -> R.color.day18
            19 -> R.color.day19
            20 -> R.color.day20
            21 -> R.color.day21
            22 -> R.color.day22
            23 -> R.color.day23
            24 -> R.color.day24
            25 -> R.color.day25
            26 -> R.color.day26
            27 -> R.color.day27
            28 -> R.color.day28
            29 -> R.color.day29
            30 -> R.color.day30
            else -> R.color.day1 // Default
        }
        val colorInt = ContextCompat.getColor(holder.itemView.context, dayColor)
        holder.itemView.setBackgroundColor(colorInt)
    }

    override fun getItemCount(): Int {
        return wellnessTipList.size
    }
}
