package com.example.diaryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_story.*

class detailStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_story)

        val terimaTgl = intent.getStringExtra("detTglDiary")
        val terimaFoto = intent.getStringExtra("detFotoDiary")
        val terimaJudul = intent.getStringExtra("detJudulDiary")
        val terimaIsi = intent.getStringExtra("detIsiDiary")
        val terimafeel = intent.getStringExtra("detFeeling")

        if (terimafeel.toString() == "happy") {
            //imgDetailFeeling.setImageResource(R.drawable.happyemo)
            tvMood.setText("Your mood: "+terimafeel.toString())
        }
        else if (terimafeel.toString() == "netral") {
            //imgDetailFeeling.setImageResource(R.drawable.ic_baseline_sentiment_satisfied_24)
            tvMood.setText("Your mood: "+terimafeel.toString())
        }
        if (terimafeel.toString() == "sad") {
            //imgDetailFeeling.setImageResource(R.drawable.sademo)
            tvMood.setText("Your mood: "+terimafeel.toString())
        }

        tvDateDetail.setText("Date: " + terimaTgl)
        if(terimaFoto == "default")
        {
            imgViewDetail.setImageResource(R.drawable.diarypic)
        }
        else{
            Picasso.get().load(terimaFoto).into(imgViewDetail)
        }
        etTitleDetail.setText(terimaJudul)
        etIsiDetail.setText(terimaIsi)

        btnBack.setOnClickListener {
            finish()
        }

    }
}