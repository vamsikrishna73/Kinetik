package com.kinetik.gradle

import com.android.build.api.instrumentation.FramesComputationMode
import com.android.build.api.instrumentation.InstrumentationScope
import org.gradle.api.Plugin
import org.gradle.api.Project

//class KinetikPlugin : Plugin<Project> {
//    override fun apply(project: Project) {
//        println("🔥 Kinetik plugin applied to ${project.name}")
//    }
//}


class KinetikPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        println("🔥 Kinetik plugin applied to ${project.name}")
        project.plugins.withId("com.android.application") {
            val androidComponents =
                project.extensions.getByType(
                    com.android.build.api.variant.AndroidComponentsExtension::class.java
                )

            androidComponents.onVariants { variant ->
                variant.instrumentation.transformClassesWith(
                    KineticTransform::class.java,
                    InstrumentationScope.PROJECT
                ) {}

                variant.instrumentation.setAsmFramesComputationMode(
                    FramesComputationMode.COPY_FRAMES
                )
            }
        }
    }
}

