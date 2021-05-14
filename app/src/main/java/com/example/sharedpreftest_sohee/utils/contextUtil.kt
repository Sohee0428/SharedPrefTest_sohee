package com.example.sharedpreftest_sohee.utils

import android.content.Context

class contextUtil {


    companion object {

//        메모장 내용을 저장하기위한 예시

//        메모장 이름 짓기

        private val prefName = "TestPref"

//        오타를 방지하기 위해 자주 사용하는 단어 저장하기

        private val AUTO_LOGIN = "AUTO_LOGIN"

//        자동 로그인 저장하기

        fun setAutoLogin(context: Context, autoLogin: Boolean) {

            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

            pref.edit().putBoolean(AUTO_LOGIN, autoLogin).apply()
        }

//        저장된 내용 불러오기

        fun getAutoLogin(context: Context) : Boolean {

            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

//            저장된 데이터가 있으면 자동로그인, 없으면 안함

            return pref.getBoolean(AUTO_LOGIN, false)
        }
    }
}