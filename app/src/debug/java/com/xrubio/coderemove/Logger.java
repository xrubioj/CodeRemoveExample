package com.xrubio.coderemove;

import android.util.Log;

// This is a logger class implemented for the example of "Alternate classes in your code depending on buildType or
// flavor (source sets)". This is the implementation corresponding to the debug build type

public class Logger {

    private static final String TAG = Logger.class.getSimpleName();

    public static void log(String message) {
        Log.d(TAG, message);
    }
}
