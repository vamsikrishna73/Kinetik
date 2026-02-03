package com.kinetik.gradle

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes


//class OnResumeMethodVisitor(
//    mv: MethodVisitor
//) : MethodVisitor(Opcodes.ASM9, mv) {
//
//    override fun visitCode() {
//        super.visitCode()
//
//        // Load "this"
//        mv.visitVarInsn(Opcodes.ALOAD, 0)
//
//        // Call runtime method
//        mv.visitMethodInsn(
//            Opcodes.INVOKESTATIC,
//            "com/kinetik/runtime/AnimatorEngine",
//            "onScreen",
//            "(Landroid/app/Activity;)V",
//            false
//        )
//    }
//}

//class OnResumeMethodVisitor(
//    mv: MethodVisitor
//) : MethodVisitor(Opcodes.ASM9, mv) {
//
//    override fun visitMethodInsn(
//        opcode: Int,
//        owner: String?,
//        name: String?,
//        descriptor: String?,
//        isInterface: Boolean
//    ) {
//        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
//
//        // Detect super.onResume()
//        println("Kineticccccccccccccccccccccccc ${name}")
//        if (
//            opcode == Opcodes.INVOKESPECIAL &&
//            name == "onResume" &&
//            (owner == "android/app/Activity"
//                    || owner == "androidx/activity/ComponentActivity"
//                    || owner == "androidx/appcompat/app/AppCompatActivity")
//        ) {
//            // Inject AFTER super.onResume()
//            mv.visitVarInsn(Opcodes.ALOAD, 0)
//            mv.visitMethodInsn(
//                Opcodes.INVOKESTATIC,
//                "com/kinetik/runtime/AnimatorEngine",
//                "onScreen",
//                "(Landroid/app/Activity;)V",
//                false
//            )
//        }
//    }
//}

class OnResumeMethodVisitor(
    mv: MethodVisitor
) : MethodVisitor(Opcodes.ASM9, mv) {

    override fun visitInsn(opcode: Int) {

        // Inject right before method returns
        if (opcode == Opcodes.RETURN) {
            mv.visitVarInsn(Opcodes.ALOAD, 0)
            mv.visitMethodInsn(
                Opcodes.INVOKESTATIC,
                "com/kinetik/runtime/AnimatorEngine",
                "onScreen",
                "(Landroid/app/Activity;)V",
                false
            )
        }

        super.visitInsn(opcode)
    }
}
