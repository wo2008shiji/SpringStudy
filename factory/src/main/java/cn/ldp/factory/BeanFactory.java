package cn.ldp.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 第一步：需要配置文件来配置service和dao
 *      配置的内容：唯一标识=全限定类名(key=value)
 * 第二步：通过读取配置文件的内容，反射创建对象
 */
public class BeanFactory {
    private static Properties props;
    private static Map<String,Object> map;
    static {
        props = new Properties();
        map = new HashMap<String, Object>();
        InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            props.load(inputStream);
            Enumeration keys = props.keys();
            while (keys.hasMoreElements()){
                String beanNameKey = keys.nextElement().toString();
                String beanNameValue = props.getProperty(beanNameKey);
                Object bean = Class.forName(beanNameValue).newInstance();
                map.put(beanNameKey, bean);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化配置文件失败");
        }
    }
    public static Object getBean(String beanNameKey){
        return map.get(beanNameKey);
    }
    /*public static Object getBean(String beanNameKey){
        Object bean = null;
        String beanNameValue = props.getProperty(beanNameKey);
        try {
            bean = Class.forName(beanNameValue).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }*/
}
