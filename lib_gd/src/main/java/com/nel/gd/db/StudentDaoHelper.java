package com.nel.gd.db;

import com.nel.gd.entity.Student;

import java.util.List;

/**
 * Description :
 * CreateTime : 2018/4/28 14:23
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class StudentDaoHelper implements DaoOperateHelper<Student> {

    private static volatile StudentDaoHelper studentDaoHelper;

    private StudentDaoHelper(){}

    public static StudentDaoHelper getHelper() {
        if (studentDaoHelper == null) {
            synchronized (StudentDaoHelper.class) {
                if (studentDaoHelper == null) {
                    studentDaoHelper = new StudentDaoHelper();
                }
            }
        }
        return studentDaoHelper;
    }

    /**
     * 插入数据库
     * @param data
     */
    @Override
    public void insertData(Student data) {
        DbManager.getDbManager().getDaoSession().getStudentDao()
                .insert(data);
    }


    /**
     * 将数据实体通过事物添加至数据库
     * @param dataList
     */
    @Override
    public void insertDataList(List<Student> dataList) {
        if (null == dataList || dataList.size() == 0) return;
        DbManager.getDbManager().getDaoSession().getStudentDao()
                .insertInTx(dataList);
    }

    /**
     * 将数据添加进数据库，如果存在，将覆盖原来的数据，否则，插入
     * @param data
     */
    @Override
    public void saveData(Student data) {
        DbManager.getDbManager().getDaoSession().getStudentDao()
                .save(data);
    }

    @Override
    public void deleteData(Student data) {
        DbManager.getDbManager().getDaoSession().getStudentDao()
                .delete(data);
    }

    @Override
    public void deleteByKey(long id) {
        DbManager.getDbManager().getDaoSession().getStudentDao()
                .deleteByKey(id);
    }

    @Override
    public void deleteAllData() {
        DbManager.getDbManager().getDaoSession().getStudentDao()
                .deleteAll();
    }

    @Override
    public void updateData(Student data) {
        DbManager.getDbManager().getDaoSession().getStudentDao()
                .update(data);
    }

    @Override
    public List<Student> queryAll() {
        return DbManager.getDbManager().getDaoSession().getStudentDao()
                .queryBuilder()
                .list();
    }

    /**
     * 分页加载
     * @param pageSize 当前第几页
     * @param pageNum 每页显示多少个
     */
    @Override
    public List<Student> queryPaging(int pageSize, int pageNum) {
        return DbManager.getDbManager().getDaoSession().getStudentDao()
                .queryBuilder()
                .offset(pageSize * pageNum)
                .limit(pageNum)
                .list();
    }
}
