package factory;

import com.factory.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName factoryDemo.java
 * @Description TODO
 * @createTime 2021-02-23 14:46:00
 */
public class factoryDemo {

    public static void main(String[] args) {

        IAbstractFactory applefactory = new AppleFactory();
        IPC applePC = applefactory.makePC();
        applePC.make();
        IPhone applePhone = applefactory.makePhone();
        applePhone.make();


        IAbstractFactory miFactory = new MiFactory();
        IPhone miPhone = miFactory.makePhone();
        miPhone.make();
        IPC miPC = miFactory.makePC();
        miPC.make();
    }
}
