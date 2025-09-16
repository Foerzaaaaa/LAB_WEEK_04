package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CafeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_cafe_detail, container, false)
        val textView: TextView = root.findViewById(R.id.cafe_detail_text)
        val title = arguments?.getString(ARG_TITLE) ?: "Cafe"
        val desc = arguments?.getString(ARG_DESC) ?: "No description available."

        textView.text = "$title\n\n$desc"

        return root
    }

    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_DESC = "desc"

        fun newInstance(title: String, desc: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putString(ARG_TITLE, title)
            args.putString(ARG_DESC, desc)
            fragment.arguments = args
            return fragment
        }
    }
}
