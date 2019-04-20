package sheng.model;

/**
 * 饿汉式单例模式:
 * 特点:不光三七二十一在加载类的时候就创建实例对象,保存在堆内存中
 * 缺点:如果不使用这个实例对象,但是堆内存中还保存这实例对象,这样就会造成内存资源的浪费
 */
public class EHanDanli {
    //维护一个私有的实例对象,并且把构造器私有化,保存外界不能创建对象
    private static EHanDanli eHanDanli=new EHanDanli();
    private EHanDanli(){

    }
    //给外界提供一个获取实例对象的方法
    public static EHanDanli getInstance(){
        return eHanDanli;
    }
}
