package com.wbz;

/**
 * Created by 王炳智 on 2017/8/24.
 */
public class Service {
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    private Dao dao;

    public void zhuanzhang(){

        //周杰伦多钱的操作
        dao.addmoney();
            //出现异常，但是配置了事务操作之后，操作回滚，转账不成功
            int i = 10/0;

        //王力宏少钱的操作
        dao.minmoney();
    }
}
