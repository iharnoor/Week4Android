package com.google.fragmentstest.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.fragmentstest.viewmodel.CountViewModel
import com.google.fragmentstest.R
import com.google.fragmentstest.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val viewModel: CountViewModel by activityViewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    // used for inflating
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    // used for the views which are finally made and can be initialized
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            val dataBundle = Bundle()
            dataBundle.putInt("key", 1) // Replace with your actual data

            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment, dataBundle)
        }

        // lifecycleowner -> provides a way to unsubscribe when we the app / page / fragment is not used
        viewModel.getCount().observe(viewLifecycleOwner) {
            binding.textCount.text = it.toString()
        }

        binding.btnIncrement.setOnClickListener {
            viewModel.increment()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}