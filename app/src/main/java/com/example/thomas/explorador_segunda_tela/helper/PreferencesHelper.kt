package com.example.thomas.explorador_segunda_tela.helper

import android.content.Context
import android.content.SharedPreferences
import android.util.Log

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

import java.lang.reflect.Type
import java.util.ArrayList

class PreferencesHelper(context: Context) {

    private var mPref: SharedPreferences

    companion object {
        private val TAG = "PreferencesHelper"
        private val PREF_FILE_NAME = "app_pref_file"
        val KEY_LIST_X = "key_list_x"
        val KEY_LIST_Y = "key_list_y"
    }

    init {
        mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun clear() {
        mPref.edit().clear().apply()
    }

    fun saveListPoints(list: ArrayList<String>, key: String) {
        val gson = Gson()
        val json = gson.toJson(list)
        mPref.edit().putString(key, json).apply()
    }

    fun getListPoints(key: String): ArrayList<String>? {
        val gson = Gson()
        val json = mPref.getString(key, null)
        val type = object : TypeToken<ArrayList<String>>() {

        }.type
        return gson.fromJson<ArrayList<String>>(json, type)
    }

    fun putPointX(x: Float) {
        var listPointsX = getListPoints(KEY_LIST_X)
        if (listPointsX == null)
            listPointsX = ArrayList()
        listPointsX.add(x.toString())
        saveListPoints(listPointsX, KEY_LIST_X)
    }

    fun putPointY(y: Float) {
        var listPointsX = getListPoints(KEY_LIST_Y)
        if (listPointsX == null)
            listPointsX = ArrayList()
        listPointsX.add(y.toString())
        saveListPoints(listPointsX, KEY_LIST_Y)
    }

}
