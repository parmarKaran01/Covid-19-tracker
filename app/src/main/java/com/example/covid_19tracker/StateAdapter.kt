package com.example.covid_19tracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_list.view.*

class StateAdapter(val list: List<StatewiseItem>) : BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        val item = list[position]
        view.confirmed_list_tv.text = item.confirmed
        view.active_list_tv.text = item.active
        view.recovered_list_tv.text = item.recovered
        view.deceased_list_tv.text = item.deaths
        view.state_list_tv.text = item.state

        return view
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }
}