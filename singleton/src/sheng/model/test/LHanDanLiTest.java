package sheng.model.test;

import sheng.model.LHanDanli;

public class LHanDanLiTest {
    public static void main(String[] args) {
        LHanDanli lHanDanli1 = LHanDanli.getinstance2();
        System.out.println("lHanDanli1:"+lHanDanli1);
        //第一次测试地址值:sheng.model.LHanDanli@1b6d3586\
        LHanDanli lHanDanli2 = new LHanDanLiTest().getLHanDanli();
        System.out.println("lHanDanli2:"+lHanDanli2);
        LHanDanli lHanDanli3 = new LHanDanLiTest().getLHanDanli();
        System.out.println("lHanDanli3:"+lHanDanli3);
        LHanDanli lHanDanli4 = new LHanDanLiTest().getLHanDanli();
        System.out.println("lHanDanli4:"+lHanDanli4);
        //
        LHanDanli lHanDanli5 = new LHanDanLiTest().getLHanDanli();
        System.out.println("lHanDanli5:"+lHanDanli2);
        LHanDanli lHanDanli6 = new LHanDanLiTest().getLHanDanli();
        System.out.println("lHanDanli6:"+lHanDanli3);
        LHanDanli lHanDanli7 = new LHanDanLiTest().getLHanDanli();
        System.out.println("lHanDanli7:"+lHanDanli4);
    }

    public LHanDanli getLHanDanli(){
        return LHanDanli.getinstance2();
    }
}
