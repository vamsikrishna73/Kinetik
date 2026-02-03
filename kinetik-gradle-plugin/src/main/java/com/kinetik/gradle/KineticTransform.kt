package com.kinetik.gradle

import com.android.build.api.instrumentation.*
import org.objectweb.asm.ClassVisitor

abstract class KineticTransform :
    AsmClassVisitorFactory<InstrumentationParameters.None> {

    override fun isInstrumentable(classData: ClassData): Boolean {
        val name = classData.className

        // Ignore Kotlin top-level files
        if (name.endsWith("Kt")) return false

        println("KINETIK TRANSFORM HIT: $name")

        // Only app classes (DOT format!)
        return name.startsWith("com.example.kinetik.")
    }
    override fun createClassVisitor(
        classContext: ClassContext,
        nextClassVisitor: ClassVisitor
    ): ClassVisitor {
        return ActivityClassVisitor(nextClassVisitor)
    }
}
