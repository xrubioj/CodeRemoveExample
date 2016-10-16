# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/teknik/Library/Android/sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-assumenosideeffects class com.xrubio.coderemove.MainActivity {
    private void outputDebugLogMessage();
}

## The following rules are meant to make the Proguard example easier to understand. You probably should not
## use them in production code.

# Disabled method inlining. Original rule in proguard-android-optimize.txt:
# -optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*
-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*,!method/inlining/*
