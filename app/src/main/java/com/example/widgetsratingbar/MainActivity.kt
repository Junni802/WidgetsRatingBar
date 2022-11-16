package com.example.widgetsratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widgetsratingbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)
		
		binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, b -> 
		// ratingBar : 현 이벤트를 일으킨 객체, rating : 선택한 별점, b : 사용자 입력여부
			binding.textScore.setText("별점은 ${rating}점입니다")
		}
		/*
		numStars : 별점 최대값(기본값 : 5.0)
		rating : 시작할 때 보일 기본 별점(float, 기본값 : 0.0)
		stepSize : 별점 선택 최소 단위(float, 기본값 : 0.5)
		 */
	}
}