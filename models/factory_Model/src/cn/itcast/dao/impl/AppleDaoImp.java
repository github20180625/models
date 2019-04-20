package cn.itcast.dao.impl;

import cn.itcast.dao.FruitDao;
/*车间二*/
public class AppleDaoImp implements FruitDao{
    @Override
    public void makeFruit() {
        System.out.println("我生产苹果!!!");
    }
}
