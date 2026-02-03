package com.kinetik.runtime.core

data class ScreenEvent(
    val name: String,
    val type: ScreenType,
    val params: Map<String, Any?> = emptyMap()
)
