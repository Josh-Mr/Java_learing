package com.josh;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ExampleTest2.java
 * @Description TODO
 * @createTime 2020-03-24 23:11:00
 */
/**

 * java反射的入门例子：对set和get方法的复制
 * */
public class ExampleTest2 {
    public int age ;
    public String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ExampleTest2(){

    }
    public ExampleTest2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 简单地复制对象
    public static Object copy(Object object) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class<?> ExampleTest2Class = object.getClass();
        Constructor<?> constructor = ExampleTest2Class.getConstructor();
        Object newInstance = constructor.newInstance();
        Field[] fields = ExampleTest2Class.getFields();

        for (Field field : fields){

            String name = field.getName();
            String getMethosName = "get"+name.substring(0,1).toUpperCase()+name.substring(1);
            String setMethosName = "set"+name.substring(0,1).toUpperCase()+name.substring(1);

            Method getMethod = ExampleTest2Class.getMethod(getMethosName, new Class[]{});
            Method setMethod = ExampleTest2Class.getMethod(setMethosName, new Class[]{field.getType()});

            Object getInvoke = getMethod.invoke(object, new Object[]{});
            Object setInvoke = setMethod.invoke(newInstance, new Object[]{getInvoke});

        }
        return newInstance;
    }
    @Override
    public String toString() {
        return "ExampleTest2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<ExampleTest2> ExampleTest2Class = ExampleTest2.class;
        // 用反射的构造方法生成对象
        Constructor<ExampleTest2> constructor = ExampleTest2Class.getConstructor(new Class[]{});
        ExampleTest2 ExampleTest2 = constructor.newInstance(new Object[]{});
        // 直接用newInstance生成对象
        ExampleTest2 ExampleTest21 = ExampleTest2Class.newInstance();
        System.out.println(ExampleTest21);

        Constructor<ExampleTest2> constructor2 = ExampleTest2Class.getConstructor(new Class[]{int.class,String.class});
        ExampleTest2 ExampleTest22 = constructor2.newInstance(new Object[] {23,"josh"});
        System.out.println(ExampleTest22);

        ExampleTest2 d = new ExampleTest2(12,"josh");

        System.out.println(copy(d).toString());
    }
}
