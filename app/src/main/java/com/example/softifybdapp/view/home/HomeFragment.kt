package com.example.softifybdapp.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.softifybdapp.R
import java.util.*


class HomeFragment : Fragment() {
    lateinit var view1 : View
    lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        view1 =  inflater.inflate(R.layout.home_fragment, container, false)
        return view1.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.attendanceRecycler)
        setAdapterData();
    }

    private fun setAdapterData() {
        val attendanceList = ArrayList<AttendanceModel>();
        attendanceList.add(AttendanceModel("10.10AM", "7.10PM", "1 Jun 2022", "10.00AM", "7.00PM"))
        attendanceList.add(AttendanceModel("10.00AM", "7.00PM", "2 Jun 2022", "10.00AM", "7.00PM"))
        attendanceList.add(AttendanceModel("11.05AM", "7.15PM", "3 Jun 2022", "10.00AM", "7.00PM"))

        recyclerView.adapter = HomeAdapter(attendanceList)
        recyclerView.layoutManager = LinearLayoutManager(context)
    }


}