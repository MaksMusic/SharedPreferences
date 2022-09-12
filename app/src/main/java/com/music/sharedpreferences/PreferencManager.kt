package com.music.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class PreferencManager (context: Context) {
    private var sharedPreferences:SharedPreferences =
        context.getSharedPreferences("tableName",Context.MODE_PRIVATE)


    fun putString(key:String?,value:String?){
        val editor = sharedPreferences.edit()
        editor.putString(key,value)
        editor.apply()
    }

    fun getString(key: String?) :String?{
        return sharedPreferences.getString(key,null)
    } // он не получит данные
}