package com.nel.realm.db;

import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Description :
 * CreateTime : 2018/4/28 15:20
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class DbManager {
    private static volatile DbManager instance;
    private static final String DB_NAME = "test.realm";
    private Realm mRealm;

    private DbManager() {
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name(DB_NAME)
                .build();

        mRealm = Realm.getInstance(configuration);
    }

    public static void init(Context context) {
        Realm.init(context);
    }

    public static DbManager getInstance() {
        if (instance == null) {
            synchronized (DbManager.class) {
                if (instance == null) {
                    instance = new DbManager();
                }
            }
        }
        return instance;
    }

    public Realm getRealm() {
        return mRealm;
    }
}
