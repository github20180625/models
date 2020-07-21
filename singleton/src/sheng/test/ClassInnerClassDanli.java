package sheng.test;

public class ClassInnerClassDanli {
    private ClassInnerClassDanli(){}

    private static class ClassDanli{
        private static ClassInnerClassDanli c1=new ClassInnerClassDanli();
    }

    public static ClassInnerClassDanli getInstance(){
        return ClassDanli.c1;
    }
}
