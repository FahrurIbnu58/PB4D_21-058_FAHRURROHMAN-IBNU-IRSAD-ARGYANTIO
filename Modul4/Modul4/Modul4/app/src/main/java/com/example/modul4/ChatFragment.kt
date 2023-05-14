package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ChatFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var collegeStudentAdapter: CollegeStudentAdapter
    private lateinit var collegeStudent: MutableList<CollegeStudent>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        recyclerView = view.findViewById(R.id.recyclerview)

        val layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager

        collegeStudent = mutableListOf()
        collegeStudent.add(CollegeStudent("Fahrurrohman Ibnu Irsad Argyanto",  R.drawable.ibnu))
        collegeStudent.add(CollegeStudent("Fajar Anshori",  R.drawable.mhs2))
        collegeStudent.add(CollegeStudent("Abdul Hakim", R.drawable.mhs1))
        collegeStudent.add(CollegeStudent("Dzikri Amirul", R.drawable.mhs4))
        collegeStudent.add(CollegeStudent("Mahfud Abdul Jalil", R.drawable.mhs5))



        collegeStudentAdapter = CollegeStudentAdapter(collegeStudent)
        recyclerView.adapter = collegeStudentAdapter

        return view
    }
}