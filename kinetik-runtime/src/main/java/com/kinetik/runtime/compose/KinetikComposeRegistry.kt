package com.kinetik.runtime.compose

import ComposeAnimationCommand
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.runtime.mutableStateMapOf

//internal object KinetikComposeRegistry {
//
//    private val animatables =
//        mutableStateMapOf<String, Animatable<Float, AnimationVector1D>>()
//
//    fun animatableFor(tag: String): Animatable<Float, AnimationVector1D> {
//        return animatables.getOrPut(tag) {
//            Animatable(0f)
//        }
//    }
//}


import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

internal object KinetikComposeRegistry {

    private val _commands =
        MutableSharedFlow<ComposeAnimationCommand>(
            extraBufferCapacity = 64
        )

    val commands = _commands.asSharedFlow()

    fun emit(command: ComposeAnimationCommand) {
        _commands.tryEmit(command)
    }
}

