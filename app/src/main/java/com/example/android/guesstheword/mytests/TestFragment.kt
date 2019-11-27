package com.example.android.guesstheword.mytests

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.example.android.guesstheword.R
import com.example.android.guesstheword.databinding.TestFragmentBinding

class TestFragment : Fragment() {



    companion object {
        fun newInstance() = TestFragment()
    }

    private lateinit var viewModel: TestViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: TestFragmentBinding = DataBindingUtil.inflate(
                inflater,R.layout.test_fragment,container, false
        )
        binding.displayResult.text = "Bound"
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TestViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
