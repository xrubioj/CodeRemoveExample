package com.xrubio.coderemove;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        debugFlagExample();

        alternateSourceSetsExample();

        proguardRemoveFunction();
    }

    // region Debug flag

    private void debugFlagExample() {
        // Example 1: Using the debug flag with a simple if statement
        ApplicationInfo appInfo = getApplicationContext().getApplicationInfo();
        boolean isDebuggable = (appInfo.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        if (isDebuggable) {
            TextView buildTypeTextView = (TextView) findViewById(R.id.build_type);
            buildTypeTextView.setText("Debug build");
        }
    }

    // endregion

    // region Alternate source sets

    private void alternateSourceSetsExample() {
        // Example 3: Alternate classes in your code depending on buildType or flavor (source sets)
        Logger.log("This should only be logged on debug builds");
    }

    // endregion

    // region Proguard

    private void proguardRemoveFunction() {
        // Example 4: Remove functions using Proguard
        outputDebugLogMessage();
    }

    private void outputDebugLogMessage() {
        Log.d("Proguard", "This should only be logged on debug builds and will be removed by Proguard");
    }

    // endregion

}
