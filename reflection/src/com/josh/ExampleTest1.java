package josh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Demo.java
 * @Description TODO
 * @createTime 2020-03-30 09:41:00
 */

/**
 * 反射的入门知识
 */
public class ExampleTest1 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        /* 生成Class类对象的三种方式
        *  一、类的全路径名
        *   Class<?> classType = Class.forName("com.josh.ClassName");
        *   二、类名.class方式
        *    Class<?> ClassType = ClassName.class;
        *   三 、对象实例的getClass()
        *    Class<?> aClass = newClassname.getClass();
        */

/*
        // 所有方法
        Method[] declaredMethods = classType.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
*/
        // 第二种方式
        Class<AlgorithmTest> algorithmTestClass = AlgorithmTest.class;
        // 创建对象
        AlgorithmTest algorithmTest = algorithmTestClass.newInstance();
        /*
            获取指定的方法
            可变参数-传参数的两种形式：可变参数的底层也是用数组的封装的。
                1、直接传参数
                .getMethod("add", int.class, int.class);

                2、用数组封装后传参
                .getMethod("add", new Class[]{int.class, int.class});
         */

        Method addMethod = algorithmTestClass.getMethod("add", int.class, int.class);
        Method add1 = algorithmTestClass.getMethod("add", new Class[]{int.class, int.class});

        Object invoke = addMethod.invoke(algorithmTest, 12, 13);
        Object invoke1 = add1.invoke(algorithmTest, new Object[]{12, 14});

        System.out.println(invoke);
        System.out.println(invoke1);
    }
}
class AlgorithmTest {
    public int add(int num , int num2){
        return num + num2;
    }
    public String joint(String start , String end){
        return  start + end;
    }
}
