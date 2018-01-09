package com.aky.dagger.dinjection.module;

import android.app.Activity;
import android.content.Context;

import com.aky.dagger.dinjection.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Asus on 09-01-2018.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity){
        this.mActivity=activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

}
