package cn.itcast.dao.impl;

import cn.itcast.dao.FruitDao;

/*车间一*/
public class PearDaoImp implements FruitDao {
    @Override
    public void makeFruit() {
        System.out.println("我生产梨~~~~~");
    }
}
