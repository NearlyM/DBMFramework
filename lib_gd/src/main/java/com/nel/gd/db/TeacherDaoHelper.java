package com.nel.gd.db;

import com.nel.gd.entity.Teacher;

import java.util.List;

/**
 * Description :
 * CreateTime : 2018/4/28 14:37
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class TeacherDaoHelper implements DaoOperateHelper<Teacher> {

    private static volatile TeacherDaoHelper teacherDaoHelper;

    private TeacherDaoHelper(){}

    public static TeacherDaoHelper getHelper() {
        if (teacherDaoHelper == null) {
            synchronized (TeacherDaoHelper.class) {
                if (teacherDaoHelper == null) {
                    teacherDaoHelper = new TeacherDaoHelper();
                }
            }
        }
        return teacherDaoHelper;
    }

    /**
     * 插入数据库
     * @param data
     */
    @Override
    public void insertData(Teacher data) {
        DbManager.getDbManager().getDaoSession().getTeacherDao()
                .insert(data);
    }


    /**
     * 将数据实体通过事物添加至数据库
     * @param dataList
     */
    @Override
    public void insertDataList(List<Teacher> dataList) {
        if (null == dataList || dataList.size() == 0) return;
        DbManager.getDbManager().getDaoSession().getTeacherDao()
                .insertInTx(dataList);
    }

    /**
     * 将数据添加进数据库，如果存在，将覆盖原来的数据，否则，插入
     * @param data
     */
    @Override
    public void saveData(Teacher data) {
        DbManager.getDbManager().getDaoSession().getTeacherDao()
                .save(data);
    }

    @Override
    public void deleteData(Teacher data) {
        DbManager.getDbManager().getDaoSession().getTeacherDao()
                .delete(data);
    }

    @Override
    public void deleteByKey(long id) {
        DbManager.getDbManager().getDaoSession().getTeacherDao()
                .deleteByKey(id);
    }

    @Override
    public void deleteAllData() {
        DbManager.getDbManager().getDaoSession().getTeacherDao()
                .deleteAll();
    }

    @Override
    public void updateData(Teacher data) {
        DbManager.getDbManager().getDaoSession().getTeacherDao()
                .update(data);
    }

    @Override
    public List<Teacher> queryAll() {
        return DbManager.getDbManager().getDaoSession().getTeacherDao()
                .queryBuilder()
                .list();
    }

    /**
     * 分页加载
     * @param pageSize 当前第几页
     * @param pageNum 每页显示多少个
     */
    @Override
    public List<Teacher> queryPaging(int pageSize, int pageNum) {
        return DbManager.getDbManager().getDaoSession().getTeacherDao()
                .queryBuilder()
                .offset(pageSize * pageNum)
                .limit(pageNum)
                .list();
    }
}
