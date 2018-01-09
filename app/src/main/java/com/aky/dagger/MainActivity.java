package com.aky.dagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.aky.dagger.dinjection.component.ActivityComponent;
import com.aky.dagger.dinjection.component.DaggerActivityComponent;
import com.aky.dagger.dinjection.module.ActivityModule;
import com.aky.dagger.worker.InjectedClass;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    InjectedClass injectedClass;

    private ActivityComponent activityComponent;

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityComponent= DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(AppClass.get(this).getComponent())
                .build();

        activityComponent.inject(this);
        injectedClass.callToast("Dagger2 example");

        txtView=(TextView)findViewById(R.id.txtView);
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
