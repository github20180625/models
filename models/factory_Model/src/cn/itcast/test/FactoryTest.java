package cn.itcast.test;

import cn.itcast.dao.FruitDao;
import cn.itcast.factory.FruitFactory;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void testFactory(){
        FruitDao fruit = (FruitDao) FruitFactory.getBean("fruitDao");
        fruit.makeFruit();
    }
}
