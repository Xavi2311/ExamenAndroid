package com.example.examen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentLlista : Fragment() {

    companion object {
        fun newInstance() = FragmentLlista()
    }
    private val mAdapter by lazy {

    }

    private lateinit var viewModel: FragmentLlistaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_llista, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentLlistaViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //btn = view.findViewById(R.id.button)
       // writeMSg = view.findViewById(R.id.writeMessage)

        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        //Cambiar a lista

    }
}
