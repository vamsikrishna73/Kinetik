package com.kinetik.runtime.compose

import kotlinx.coroutines.delay

object KinetikComposeBootstrap {

    fun init() {

        ScreenAnimationRegistry.register(
            screen = "profile",
            animations = listOf(
                "profile-page" to ComposeAnimationSpec(
                    durationMs = 400,
                    300
                ),
                "cta_button" to ComposeAnimationSpec(
                    durationMs = 300,
                    delayMs = 150
                )
            )
        )

        ScreenAnimationRegistry.register(
            screen = "home",
            animations = listOf(
                "home-button" to ComposeAnimationSpec(
                    durationMs = 350,
                    1000
                )
            )
        )
    }
}
