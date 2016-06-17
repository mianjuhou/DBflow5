package cn.com.jtv.dbflow5.application;

import android.app.Application;
import android.os.Environment;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

import java.io.File;

/**
 * Created by fangdean on 2016/6/17.
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initDatabase();
    }

    private void initDatabase() {
        File dir=new File(Environment.getExternalStorageDirectory(),"com.fs/db");
        if(!dir.exists()){
            dir.mkdirs();
        }
        FlowManager.init(new FlowConfig.Builder(this)//
                .setDatabaseDir(dir.getAbsolutePath())//
                .build());
    }
}
