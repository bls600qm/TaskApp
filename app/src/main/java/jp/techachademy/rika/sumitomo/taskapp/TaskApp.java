package jp.techachademy.rika.sumitomo.taskapp;

/**
 * Created by rikasumitomo on 2017/08/31.
 */
import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }

}

