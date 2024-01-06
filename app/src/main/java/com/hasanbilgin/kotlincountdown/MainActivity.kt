package com.hasanbilgin.kotlincountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        toplam 10sn oldu için 100000 diğeri içinse kaç sn bir geri sayması için 1000
        object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                println("Left: ${millisUntilFinished / 1000}")
            }

            override fun onFinish() {
                println("Left: 0")

            }

        }.start()
    }
}