package com.aky.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.aky.dagger.dinjection.component.ActivityComponent;
import com.aky.dagger.dinjection.component.DaggerActivityComponent;
import com.aky.dagger.dinjection.module.ActivityModule;
import com.aky.dagger.worker.InjectedClass;

import javax.inject.Inject;

/**
 * Created by Asus on 09-01-2018.
 */

public class SecondActivity extends AppCompatActivity {

    @Inject
    InjectedClass injectedClass;

    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityComponent= DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(AppClass.get(this).getComponent())
                .build();

        activityComponent.inject(this);
        injectedClass.callToast("Second class");

    }
}
