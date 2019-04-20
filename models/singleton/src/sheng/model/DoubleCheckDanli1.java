package sheng.model;

/**
 * 改进版的双重校验单例模式
 * 加入关键字    volatile(容易改变的,不稳定的)用这个关键字实例对象,可以把对象标记位<易改变的>
 * 有点:①由于具有同步锁的问题,第一次加载时反应较慢;
 */
public class DoubleCheckDanli1 {
    //维护一个单例对象,并且维护一个私有的构造器
    private static volatile DoubleCheckDanli1 doubleCheckDanli1=null;
    private DoubleCheckDanli1(){

    }

    /**
     * 提供一个外界调用的生成实例对象的方法,双重校验
     * @return
     */
    public static DoubleCheckDanli1 getInstance(){
        if (doubleCheckDanli1==null){
            synchronized (DoubleCheckDanli1.class){
                if (doubleCheckDanli1==null){
                    doubleCheckDanli1=new DoubleCheckDanli1();
                }
            }
        }
        return doubleCheckDanli1;
    }
}
