package com.kinetik.runtime.compose

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutSlowInEasing

data class ComposeAnimationSpec(
    val durationMs: Int = 300,
    val delayMs: Int = 0,
    val easing: Easing = FastOutSlowInEasing
)
