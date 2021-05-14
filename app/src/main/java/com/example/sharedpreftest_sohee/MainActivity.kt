package com.example.sharedpreftest_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreftest_sohee.utils.contextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autoLoginCheckedBox.setOnCheckedChangeListener { buttonView, isChecked ->

//            지금 체크된 상황을 그대로 => ContextUtil을 이용해 자동 로그인 여부로 저장

            contextUtil.setAutoLogin(this, isChecked)
        }

//        화면이 만들어 지면 => 저장된 자동 로그인 여부 값을 => 체크 박스에 반영

        autoLoginCheckedBox.isChecked = contextUtil.getAutoLogin(this)
    }
}