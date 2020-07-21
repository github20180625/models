package sheng.test;


/**
 * 改良版的懒汉式
 */
public class LHanDanli {
  private static volatile LHanDanli lHanDanli=null;
  private LHanDanli(){}
  public static LHanDanli getInstance(){
      if (lHanDanli==null){
          synchronized (LHanDanli.class){
              if (lHanDanli==null){
                  lHanDanli=new LHanDanli();
              }
          }
      }
      return lHanDanli;
  }
}

