package com.xrubio.coderemove;

// This is a logger class implemented for the example of "Alternate classes in your code depending on buildType or
// flavor (source sets)". This is the implementation corresponding to the release build type

public class Logger {

    public static void log(String message) {
        // Empty method that does nothing for release builds
    }
}
