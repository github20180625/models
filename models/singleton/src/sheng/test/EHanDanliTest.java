package sheng.test;

/**
 * 饿汉式单例模式
 */
public class EHanDanliTest {
    private static EHanDanliTest eHanDanliTest=new EHanDanliTest();

    private EHanDanliTest(){

    }

    public static EHanDanliTest getInstance(){
        return eHanDanliTest;
    }
}
