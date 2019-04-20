package sheng.model;

/**
 * 懒汉式单例模式:需要时才去创建实例对象,存放在堆内存中
 */
public class LHanDanli {
    //维护一个私有到的对象实例,私有的目的是为不了不让外界直接获取这个对象,
    //如果想使用这个对象,可以通过提供的公共方法,让外界调用
    private static LHanDanli lHanDanli=null;
    //把构造器私有化,不让外界直接创建
    private LHanDanli(){

    }
    /**
     * 第一种提供外界调用的方法:不适用锁机制
     * 特点:如果不适用锁机制,在多线程是不安全的,如果两个线程进行操作:
     *     A线程进入方法内部,刚进行创建了对象还没有返回,此时B线程获取了资源
     *     B线程又创建了一个实例对象,那么久存在两个实例对象,这样就不满足单例的情况了
     *     所以这种创建单例的方法是不满足于多线程中维护一个单例的情况
     * @return
     */
    public static LHanDanli getinstance2(){
        if (lHanDanli==null){
            lHanDanli=new LHanDanli();
        }
        return lHanDanli;
    }

    /**
     * 第二种提供外界调用的方法:使用同步锁机制
     * 特点:在多线程操作时,当一个线程操作时,如果方法没有执行结束,其他线程是没法进入到方法中的
     *      这样也可以保证实例对象的唯一性,但是存在一个问题:也就是锁机制固有的问题:效率低
     *      解释说明:如果一个线程没有执行完方法,而被其他线程抢占了资源,那么其他线程是进入不了
     *      这个方法中去创建实例对象的,那么在多线程中,就会造成线程的效率降低
     * @return
     */
    public static synchronized LHanDanli getinstance(){
        if (lHanDanli==null){
            lHanDanli=new LHanDanli();
        }
        return lHanDanli;
    }
}
