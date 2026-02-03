# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
############################################
# KEEP ALL CLASSES, METHODS, FIELDS
############################################

-keep class ** {
    *;
}

-keepclassmembers class ** {
    *;
}

############################################
# DO NOT SHRINK, OPTIMIZE, OR OBFUSCATE
############################################

-dontshrink
-dontoptimize
-dontobfuscate

############################################
# KEEP ALL ANNOTATIONS & SIGNATURES
############################################

-keepattributes *

############################################
# KEEP INNER CLASSES
############################################

-keepattributes InnerClasses,EnclosingMethod

############################################
# KEEP ENUM VALUES
############################################

-keepclassmembers enum ** {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

############################################
# KEEP ALL CONSTRUCTORS
############################################

-keepclassmembers class ** {
    public <init>(...);
}

############################################
# KEEP ALL INTERFACES
############################################

-keep interface ** { *; }

############################################
# KEEP ALL ABSTRACT CLASSES
############################################

-keep abstract class ** { *; }

############################################
# KEEP REFLECTION USAGE SAFE
############################################

-keepclassmembers class * {
    @java.lang.reflect.* *;
}

############################################
# KEEP KOTLIN METADATA (IMPORTANT FOR KOTLIN)
############################################

-keep class kotlin.Metadata { *; }
-keepclassmembers class ** {
    *** *(...);
}

############################################
# KEEP SERIALIZABLE
############################################

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}
