package sheng.model;

/**
 * 双重校验单例模式
 * 优点:解决的饿汉式单例模式的资源浪费的问题(资源利用率高),不执行getInstance()方法就获取不到实例对象;
 * 缺点:①由于具有同步锁的问题,第一次加载时反应较慢;
 *      ②由于java内存模型中的一些问题,有时会出现失败的情况
 */
public class DoubleCheckDanli {
    //维护一个私有的实例对象;
    private static DoubleCheckDanli doubleCheckDanli=null;
    //把构造器私有化
    private DoubleCheckDanli(){

    }

    /**
     * 提供一个外界调用的生成实例对象的静态方法
     * @return
     */
    public static DoubleCheckDanli getInstance(){
        if (doubleCheckDanli==null){
            synchronized (DoubleCheckDanli.class){
                if (doubleCheckDanli==null){
                    doubleCheckDanli=new DoubleCheckDanli();
                }
            }
        }
        return doubleCheckDanli;
    }
}
