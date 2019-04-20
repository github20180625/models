package cn.itcast.factory;

import java.io.InputStream;
import java.util.Properties;
/*工厂*/
public class FruitFactory {
    /**
     * 返回值:Object
     * 可以把各种类型的对象作为返回值返回,灵活性更高
     * 参数:String name 可以通过配置文件的key获取到各种类的类路径,使得代码的复用性更强
     * @param name
     * @return
     */
    public static Object getBean(String name) {
        try {
            //加载配置文件进内存
            InputStream is = FruitFactory.class.getClassLoader().getResourceAsStream("class.properties");
            Properties pro = new Properties();
            pro.load(is);
            //从配置文件中获取到类路径信息
            String className = pro.getProperty(name);
            //获取到类的字节码
            Class aClass = Class.forName(className);
            //根据字节码获取到类的实例对象
            Object obj = aClass.newInstance();
            //返回类的实例对象
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
