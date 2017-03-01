package com.danielebachicchi.article.dbflow.core;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Daniele Bachicchi on 01/03/17.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this).build());
        //FlowLog.setMinimumLoggingLevel(FlowLog.Level.V);
    }
}
