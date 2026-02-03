package com.kinetik.gradle

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes


class ActivityClassVisitor(
    cv: ClassVisitor
) : ClassVisitor(Opcodes.ASM9, cv) {

    private var isActivity = false
    private lateinit var className: String

    override fun visit(
        version: Int,
        access: Int,
        name: String,
        signature: String?,
        superName: String?,
        interfaces: Array<out String>?
    ) {
        className = name
        println("className: $className")
        if (superName == "android/app/Activity" ||
            superName == "androidx/activity/ComponentActivity" ||
            superName == "androidx/appcompat/app/AppCompatActivity") {
            isActivity = true
        }
        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitMethod(
        access: Int,
        name: String,
        desc: String,
        signature: String?,
        exceptions: Array<out String>?
    ): MethodVisitor {
        val mv = super.visitMethod(access, name, desc, signature, exceptions)

        if (isActivity && name == "onResume" && desc == "()V") {
            return OnResumeMethodVisitor(mv)
        }
        return mv
    }
}
