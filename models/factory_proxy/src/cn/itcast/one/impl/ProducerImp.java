package cn.itcast.one.impl;

import cn.itcast.one.Producer;

public class ProducerImp implements Producer{
    @Override
    public void saleProducer(int money) {
        System.out.println("卖出产品后,获得:"+money);
    }

    @Override
    public void afterService(int money) {
        System.out.println("提供服务,获得:"+money);
    }
}
