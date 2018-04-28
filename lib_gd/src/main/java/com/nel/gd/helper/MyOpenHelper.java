package com.nel.gd.helper;

import android.content.Context;

import com.nel.gd.dao.DaoMaster;
import com.nel.gd.dao.StudentDao;
import com.nel.gd.dao.TeacherDao;

import org.greenrobot.greendao.database.Database;

/**
 * Description :
 * CreateTime : 2018/4/28 14:41
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class MyOpenHelper extends DaoMaster.OpenHelper {

    public MyOpenHelper(Context context, String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        if (oldVersion < newVersion) {
            //更改过的实体类(新增的不用加)   更新UserDao文件 可以添加多个  XXDao.class 文件
            MigrationHelper.getInstance().migrate(db, StudentDao.class, TeacherDao.class);

        }
    }
}
