package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentManager = supportFragmentManager
        val mHomeFragment = homefragment()
        val fragment = mFragmentManager.findFragmentByTag(homefragment::class.java.simpleName)
        if (fragment !is homefragment)
            Log.d("MyFlexibleFragment", "Fragment Name :" + homefragment::class.java.simpleName)
        mFragmentManager
                .beginTransaction()
                .add(R.id.wrap, mHomeFragment, homefragment::class.java.simpleName)
                .commit()
    }
}


