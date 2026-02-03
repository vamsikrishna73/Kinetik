package com.kinetik.runtime.compose

import ComposeAnimationCommand
import androidx.compose.animation.core.tween
import com.kinetik.runtime.core.ScreenEvent
import com.kinetik.runtime.core.ScreenTracker
import com.kinetik.runtime.core.ScreenType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
object KinetikComposeAnimationEngine {

    fun init() {
        ScreenTracker.addListener { event ->
            if (event.type == ScreenType.COMPOSE) {
                val animations =
                    ScreenAnimationRegistry.animationsFor(event.name)

                animations.forEach { (tag, spec) ->
                    KinetikComposeRegistry.emit(
                        ComposeAnimationCommand(tag, spec)
                    )
                }
            }
        }
    }
}

//object KinetikComposeAnimationEngine {
//
//    private val scope = CoroutineScope(Dispatchers.Main)
//
//    fun init() {
//        ScreenTracker.addListener { event ->
//            if (event.type == ScreenType.COMPOSE) {
//                onScreen(event.name)
//            }
//        }
//    }
//
//    private fun onScreen(screen: String) {
//        val animations = ScreenAnimationRegistry.animationsFor(screen)
//
//        animations.forEach { (tag, spec) ->
//            animate(tag, spec)
//        }
//    }
//
//    private fun animate(tag: String, spec: ComposeAnimationSpec) {
//        val anim = KinetikComposeRegistry.animatableFor(tag)
//
//        scope.launch {
//            anim.snapTo(0f)
//
//            anim.animateTo(
//                targetValue = 1f,
//                animationSpec = tween(
//                    durationMillis = spec.durationMs,
//                    delayMillis = spec.delayMs,
//                    easing = spec.easing
//                )
//            )
//        }
//    }
//}
