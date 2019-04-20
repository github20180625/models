package sheng.model;

/**
 * 使用静态内部类的方式:
 * 如上代码，所谓类级内部类，就是静态内部类，这种内部类与其外部类之间并没有从属关系，
 * 实现类延迟加载:
 *        加载外部类的时候，并不会同时加载其静态内部类，只有在发生调用的时候才会进行加载，
 *        加载的时候就会创建单例实例并返回，有效实现了懒加载（延迟加载），
 * 线程安全:
 *        采用和饿汉式同样的静态初始化器的方式，借助JVM来实现线程安全。
 */
public class ClassInnerClassDanli {
    //创建一个静态内部类
    private static class ClassDanli{
        private static ClassInnerClassDanli classInnerClassDanli=new ClassInnerClassDanli();
    }
    //维护一个私有构造器
    private ClassInnerClassDanli(){

    }
    //提供一个公开生成单例的方法
    public static ClassInnerClassDanli getInstance(){
        return ClassDanli.classInnerClassDanli;
    }
}
