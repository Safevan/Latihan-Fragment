package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_detail_category.*

class detailcategoryfragment : Fragment(), View.OnClickListener{
    override fun onClick(v: View) {
        when (v.id) {
        }
    }

    lateinit var tvCategoryName: TextView
    lateinit var tvCategoryDescription: TextView
    lateinit var btnProfile: Button
    lateinit var btnShowDialog: Button

    class DetailCategoryFragment : Fragment(), View.OnClickListener {

        var description: String? = null
        companion object {
            var EXTRA_NAME = "extra_name"
            var EXTRA_DESCRIPTION = "extra_description"
        }



        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)
            if (savedInstanceState != null) {
                val descFromBundle = savedInstanceState.getString(EXTRA_DESCRIPTION)
                description = descFromBundle
            }
            if (arguments != null) {
                var CategoryName = arguments?.getString(EXTRA_NAME)
                CategoryName = CategoryName
                tv_category_description.text = description
            }
        }

        override fun onClick(v: View) {
            when (v.id) {
                R.id.btn_profile -> {
                }
                R.id.btn_show_dialog -> {
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvCategoryName = view.findViewById(R.id.up)
        tvCategoryDescription = view.findViewById(R.id.tv_category_description)
        btnProfile = view.findViewById(R.id.btn_profile)
        btnProfile.setOnClickListener(this)
        btnShowDialog = view.findViewById(R.id.btn_show_dialog)
        btnShowDialog.setOnClickListener(this)
    }
}

override fun onClick(v: View) {
    when (v.id) {
        R.id.btn_profile -> {

        }

        R.id.btn_show_dialog -> {
            val mOptionDialogFragment = OptionDialogFragment()
            val mFragmentManager = childFragmentManager
            mOptionDialogFragment.show(mFragmentManager, OptionDialogFragment::class.java.simpleName)
        }
    }
}

