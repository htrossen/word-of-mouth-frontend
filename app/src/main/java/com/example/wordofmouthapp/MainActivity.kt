package com.example.wordofmouthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wordofmouthapp.ui.list.CompanyListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CompanyListFragment.newInstance())
                .commitNow()
        }
    }
}