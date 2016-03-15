package boston.hackingforgood.resourceapp;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.core.CrashlyticsCore;

import io.fabric.sdk.android.Fabric;
import timber.log.Timber;

public class BridgingTheGapApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        configureAnalytics();
        configureTimber();
    }

    private void configureAnalytics() {
        CrashlyticsCore core = new CrashlyticsCore
                .Builder()
                .disabled(!BuildConfig.USE_CRASHLYTICS)
                .build();
        Crashlytics crashlytics = new Crashlytics
                .Builder()
                .core(core)
                .build();
        Fabric.with(this, crashlytics);
    }

    private void configureTimber() {
        Timber.plant(new Timber.DebugTree());
    }
}
