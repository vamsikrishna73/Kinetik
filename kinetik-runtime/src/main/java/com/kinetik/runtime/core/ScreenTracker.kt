package com.kinetik.runtime.core

import android.util.Log

object ScreenTracker {

    private val listeners = mutableListOf<(ScreenEvent) -> Unit>()

    fun notify(event: ScreenEvent) {
        listeners.forEach { it(event) }
    }

    fun addListener(listener: (ScreenEvent) -> Unit) {
        listeners += listener
    }
}
