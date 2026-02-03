package com.kinetik.runtime.compose

internal object ScreenAnimationRegistry {

    private val screenToAnimations:
            MutableMap<String, List<Pair<String, ComposeAnimationSpec>>> =
        mutableMapOf()

    fun register(
        screen: String,
        animations: List<Pair<String, ComposeAnimationSpec>>
    ) {
        screenToAnimations[screen] = animations
    }

    fun animationsFor(screen: String):
            List<Pair<String, ComposeAnimationSpec>> =
        screenToAnimations[screen].orEmpty()
}



//package com.kinetik.runtime.compose
//
///**
// * Describes what should animate when a screen appears.
// * Internal SDK structure.
// */
//internal object ScreenAnimationRegistry {
//
//    private val screenToTags: MutableMap<String, List<String>> = mutableMapOf()
//
//    fun register(screen: String, tags: List<String>) {
//        screenToTags[screen] = tags
//    }
//
//    fun targetsFor(screen: String): List<String> {
//        return screenToTags[screen].orEmpty()
//    }
//}
