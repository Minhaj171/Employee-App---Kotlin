package com.example.softifybdapp.view.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.softifybdapp.R

class HomeAdapter (val attendanceList: List<AttendanceModel>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val  view = inflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val attendanceModel = attendanceList.get(position)
        holder.bindView(attendanceModel)
    }

    override fun getItemCount(): Int {
        return attendanceList.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var date = itemView.findViewById<TextView>(R.id.dateTitle)
        var checkIn = itemView.findViewById<TextView>(R.id.checkInTitle)
        var checkOut = itemView.findViewById<TextView>(R.id.checkOut)

        fun bindView(attendanceModel: AttendanceModel) {
            date.setText(attendanceModel.date)
            checkIn.setText(attendanceModel.checkIn)
            checkOut.setText(attendanceModel.checkOut)

        }

    }

}

