package src.cn.itcast.one.test;

import cn.itcast.one.Producer;
import cn.itcast.one.impl.ProducerImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*
* 通过接口实现动态代理
*   特点：字节码随用随创建，随用随加载
*   作用：不修改源码的基础上对方法增强
*   分类：
*      基于子类的动态代理
*   基于接口的动态代理：
*      涉及的类：Proxy
*      提供者：JDK官方
*   如何创建代理对象：
*      使用Proxy类中的newProxyInstance方法
*   创建代理对象的要求：
*      被代理类最少实现一个接口，如果没有则不能使用
* */
public class Client {
    private static Producer producer = new ProducerImp();

    public static void main(String[] args) {
        Producer proxyProducer = getProxyProducer();
        proxyProducer.saleProducer(10000);
    }

    /**
     *
     * @return
     */
    public static Producer getProxyProducer() {
        /*三个参数的含义:
         *      ClassLoader：类加载器
         *          它是用于加载代理对象字节码的。和被代理对象使用相同的类加载器。固定写法。
         *      Class[]：字节码数组
         *          它是用于让代理对象和被代理对象有相同方法。固定写法。
         *      InvocationHandler：用于提供增强的代码
         *          它是让我们写如何代理。我们一般都是些一个该接口的实现类，通常情况下都是匿名内部类，但不是必须的。
         *          此接口的实现类都是谁用谁写。*/
        Producer proxyProducer = (Producer) Proxy.newProxyInstance(producer.getClass().getClassLoader(), producer.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 执行代理对象的任何方法都会执行此方法
                     * 参数的含义:
                     * @param proxy  代理对象的引用
                     * @param method 当前执行的方法
                     * @param args   当前执行方法所需的参数
                     * @return 和被代理对象方法有相同的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //用于增强方法
                        int money = (int) args[0] * 2;
                        //如果被代理对象的返回值类型时void:则此处返回值是null
                        return method.invoke(producer, money);
                    }
                });
        return proxyProducer;
    }
}
