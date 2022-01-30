package com.example.appeventos.presentation.eventslist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appeventos.R

class EventsListFragment : Fragment() {

    companion object {
        fun newInstance() = EventsListFragment()
    }

    private lateinit var viewModel: EventsListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EventsListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}