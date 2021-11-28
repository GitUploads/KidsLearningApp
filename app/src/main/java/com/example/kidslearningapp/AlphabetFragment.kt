package com.example.kidslearningapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.GridView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AlphabetFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlphabetFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_alphabet, container, false)
        val gv = v.findViewById<GridView>(R.id.gridview)
        val alpha = Array(26){""}
        var c = 65
        for (i in 0..25)
        {
            alpha[i] = c.toChar().toString()
            c++
        }
        val adt = ArrayAdapter(requireContext(),android.R.layout.simple_dropdown_item_1line,alpha)
        gv.adapter = adt
        gv.setOnItemClickListener { _, _, i, _ ->
            val value = gv.getItemAtPosition(i).toString()
            val intent = Intent(requireContext(),AlphabetDetailACtivity::class.java)
            intent.putExtra("name",value)
            startActivity(intent)
        }
        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AlphabetFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AlphabetFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}