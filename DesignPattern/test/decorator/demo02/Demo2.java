package decorator.demo02;

import com.decorator.demo2.ComponentImpl;
import com.decorator.demo2.ConcreteDemo01;
import com.decorator.demo2.ConcreteDemo02;
import com.decorator.demo2.Decorator;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Demo2.java
 * @Description TODO
 * @createTime 2021-03-11 10:07:00
 */
public class Demo2 {
    public static void main(String[] args) {

        ComponentImpl component = new ComponentImpl();
        Decorator decorator = new Decorator(component);

        ConcreteDemo01 concreteDemo01 = new ConcreteDemo01(decorator);
        concreteDemo01.execute();




    }
}
