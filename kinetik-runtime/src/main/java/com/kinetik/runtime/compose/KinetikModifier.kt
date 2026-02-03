package com.kinetik.runtime.compose

import android.annotation.SuppressLint
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.kinetik(tag: String): Modifier = composed {

    val animatable = remember { Animatable(0f) }

    LaunchedEffect(tag) {
        KinetikComposeRegistry.commands.collect { command ->
            if (command.tag != tag) return@collect

            animatable.snapTo(0f)

            animatable.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = command.spec.durationMs,
                    delayMillis = command.spec.delayMs,
                    easing = command.spec.easing
                )
            )
        }
    }

    Modifier
        .semantics { testTag = tag }
        .graphicsLayer {
            val p = animatable.value
            alpha = p
            scaleX = 0.8f + 0.2f * p
            scaleY = 0.8f + 0.2f * p
        }
}

