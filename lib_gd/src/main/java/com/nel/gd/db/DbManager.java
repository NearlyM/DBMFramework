package com.nel.gd.db;

import android.content.Context;

import com.nel.gd.dao.DaoMaster;
import com.nel.gd.dao.DaoSession;
import com.nel.gd.helper.MyOpenHelper;

/**
 * Description :
 * CreateTime : 2018/4/28 13:49
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class DbManager {

    private static final boolean ENCRYPTED = true;

    private static final String DB_NAME = "test.db";

    private static volatile DbManager mDbManager;

    private DaoMaster mDaoMaster;

    private DaoSession mDaoSession;

    private MyOpenHelper mDevOpenHelper;

    private Context mContext;

    private DbManager(Context context) {
        this.mContext = context;
        mDevOpenHelper = new MyOpenHelper(context, DB_NAME);
        mDaoMaster = new DaoMaster(mDevOpenHelper.getWritableDatabase());
        mDaoSession = mDaoMaster.newSession();
    }

    public static void init(Context context) {
        if (mDbManager == null) {
            synchronized (DbManager.class) {
                if (mDbManager == null) {
                    mDbManager = new DbManager(context);
                }
            }
        }
    }

    public static DbManager getDbManager() {
        if (mDbManager == null) throw new NullPointerException("use it after init");
        return mDbManager;
    }

    public DaoMaster getDaoMaster() {
        return mDaoMaster;
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}
