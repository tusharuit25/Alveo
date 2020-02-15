package com.twigsoftwares.alveo;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import androidx.appcompat.app.AppCompatDelegate;

import java.util.prefs.Preferences;

public class AlveoApplication extends Application {

    public static final String NIGHT_MODE ="NIGHT_MODDE";

    private boolean isNightModeEnabled = false;

    private  static AlveoApplication alveoApplication = null;

    public static AlveoApplication getInstance()
    {
        if(alveoApplication == null)
        {
            alveoApplication = new AlveoApplication();

        }
        return alveoApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        alveoApplication = this;

        SharedPreferences mpref = PreferenceManager.getDefaultSharedPreferences(this);
        this.isNightModeEnabled = mpref.getBoolean(NIGHT_MODE,false);
    }

    public void setNightModeEnabled(boolean nightModeEnabled) {
        this.isNightModeEnabled = nightModeEnabled;

        SharedPreferences mpref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = mpref.edit();

        editor.putBoolean(NIGHT_MODE,isNightModeEnabled);
        editor.apply();

    }

    public boolean isNightModeEnabled() {
        return this.isNightModeEnabled;
    }
}
