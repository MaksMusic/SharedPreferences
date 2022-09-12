package com.music.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class PreferencManager (context: Context) {
    private var sharedPreferences:SharedPreferences =
        context.getSharedPreferences("tableName",Context.MODE_PRIVATE)

//put
    fun putString(key:String?,value:String?){
        val editor = sharedPreferences.edit()
        editor.putString(key,value)
        editor.apply()
    }

    fun putInt(key:String?,value:Int?){
        val editor = sharedPreferences.edit()
        editor.putInt(key,value!!)
        editor.apply()
    }


    fun putBoolean(key:String?,value:Boolean?){
        val editor = sharedPreferences.edit()
        editor.putBoolean(key,value!!)
        editor.apply()
    }

    fun putFloat(key:String?,value:Float?){
        val editor = sharedPreferences.edit()
        editor.putFloat(key,value!!)
        editor.apply()
    }



    //get

    fun getString(key: String?) :String?{
        return sharedPreferences.getString(key,null)
    }

    fun getInt(key: String?) :Int?{
        return sharedPreferences.getInt(key,-1)
    }

    fun getFloat(key: String?) :Float?{
        return sharedPreferences.getFloat(key,0.0f)
    }

    fun getBoolean(key: String?) : Boolean?{
        return sharedPreferences.getBoolean(key,false)
    }
}