package com.aky.dagger.dinjection.component;

import com.aky.dagger.MainActivity;
import com.aky.dagger.SecondActivity;
import com.aky.dagger.dinjection.ActivityScope;
import com.aky.dagger.dinjection.module.ActivityModule;
import dagger.Component;

/**
 * Created by Asus on 09-01-2018.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
    void inject(SecondActivity mainActivity);
}
