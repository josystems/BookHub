package com.binaryninja.readerhub.ui.exchange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.binaryninja.readerhub.R
import com.binaryninja.readerhub.ui.messages.ExchangeViewModel

class ExchangeFragment : Fragment() {

    private lateinit var exchangeViewModel: ExchangeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        exchangeViewModel =
                ViewModelProviders.of(this).get(ExchangeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_exchange, container, false)
        val textView: TextView = root.findViewById(R.id.text)
        exchangeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}