package com.example.sharedpreftest_sohee.utils

import android.content.Context

class contextUtil {


    companion object {

//        메모장 내용을 저장하기위한 예시

//        메모장 이름 짓기

        private val prefName = "TestPref"

//        자동 로그인 설정

        private val AUTO_LOGIN = "AUTO_LOGIN"

//        자동 로그인 저장하기

        fun stAutoLogin(context: Context, autoLogin: Boolean) {

            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

            pref.edit().putBoolean(AUTO_LOGIN, autoLogin).apply()
        }
    }
}