package com.nickrout.effectivethemesstyles

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textField.error = "Error"
        card.setOnClickListener({
            Log.d("MainActivity", "Pressed Card")
        })
        floatingActionButton.setOnClickListener({
            Log.d("MainActivity", "Pressed Floating Action Button")
        })
    }
}
