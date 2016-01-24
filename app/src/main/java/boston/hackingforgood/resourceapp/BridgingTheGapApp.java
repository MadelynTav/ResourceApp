package boston.hackingforgood.resourceapp;

import android.app.Application;

import timber.log.Timber;

public class BridgingTheGapApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
