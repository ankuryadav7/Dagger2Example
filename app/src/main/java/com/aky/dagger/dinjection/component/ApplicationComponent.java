package com.aky.dagger.dinjection.component;

import android.app.Application;
import android.content.Context;

import com.aky.dagger.AppClass;
import com.aky.dagger.dinjection.ApplicationContext;
import com.aky.dagger.dinjection.module.ApplicationModule;
import com.aky.dagger.worker.InjectedClass;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Asus on 09-01-2018.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(AppClass demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    InjectedClass getVolley();

}
