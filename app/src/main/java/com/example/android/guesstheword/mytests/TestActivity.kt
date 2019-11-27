package com.example.android.guesstheword.mytests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.guesstheword.R
import com.example.android.guesstheword.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityTestBinding = DataBindingUtil.setContentView(this, R.layout.activity_test)

        binding.displayResult.text = "Bound value"
    }
}
