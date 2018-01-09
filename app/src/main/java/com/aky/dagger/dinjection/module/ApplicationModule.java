package com.aky.dagger.dinjection.module;

import android.app.Application;
import android.content.Context;

import com.aky.dagger.dinjection.ApplicationContext;
import com.aky.dagger.dinjection.ClassInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Asus on 09-01-2018.
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }



}
