package com.aky.dagger.worker;

import android.content.Context;
import android.widget.Toast;
import com.aky.dagger.dinjection.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Asus on 09-01-2018.
 */

@Singleton
public class InjectedClass {

    Context mContext;

    @Inject
    public InjectedClass(@ApplicationContext Context context){
        this.mContext=context;
    }

    public void callToast(String message){
        Toast.makeText(mContext,message,Toast.LENGTH_SHORT).show();
    }

}
