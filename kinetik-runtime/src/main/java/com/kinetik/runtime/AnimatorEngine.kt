package com.kinetik.runtime

import android.app.Activity
import android.util.Log

object AnimatorEngine {
    fun init() {
        Log.d("Kinetik", "ok")
    }

    @JvmStatic
    fun onScreen(activity: Activity) {
//        throw RuntimeException("KINETIK HIT")
        Log.d("Kinetik", "Screen visible → ${activity.javaClass.simpleName}")
    }
}