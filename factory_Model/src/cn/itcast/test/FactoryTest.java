package cn.itcast.test;


import cn.itcast.dao.FruitDao;
import cn.itcast.factory.FruitFactory;

public class FactoryTest {

    public static void main(String[] args) {
        FruitDao fruit = (FruitDao) FruitFactory.getBean("fruitDao");
        fruit.makeFruit();
    }
}
