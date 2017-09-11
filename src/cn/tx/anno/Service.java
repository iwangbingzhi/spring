package cn.tx.anno;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 王炳智 on 2017/8/25.
 */
@Transactional
public class Service {
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    private Dao dao;
  public void zhuanzhang(){

      dao.minmoney();

      int i = 10/0;

      dao.addmoney();
  }
}
