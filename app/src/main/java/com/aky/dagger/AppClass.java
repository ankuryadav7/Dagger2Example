package com.aky.dagger;

import android.app.Application;
import android.content.Context;
import com.aky.dagger.dinjection.component.ApplicationComponent;
import com.aky.dagger.dinjection.component.DaggerApplicationComponent;
import com.aky.dagger.dinjection.module.ApplicationModule;

/**
 * Created by Asus on 09-01-2018.
 */

public class AppClass extends Application {
    protected ApplicationComponent applicationComponent;

    public static AppClass get(Context context) {
        return (AppClass) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
