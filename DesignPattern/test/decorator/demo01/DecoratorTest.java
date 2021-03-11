package decorator.demo01;

import com.decorator.demo1.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName DecoratorTest.java
 * @Description TODO
 * @createTime 2021-02-23 16:44:00
 */
public class DecoratorTest {

    public static void main(String[] args) {

        IAbstractComponent iAbstractComponent = new ConcreteComponent();

        AbstractDecorator abstractDecorator01 = new ConcreteDecorator01(iAbstractComponent);
//        abstractDecorator01.sampleOperator();

        AbstractDecorator  abstractDecorator02 = new ConcreteDecorator02(abstractDecorator01);
        abstractDecorator02.sampleOperator();



    }
}
