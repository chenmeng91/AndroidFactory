package ne.megvii.com.androidfactory.factory;

import ne.megvii.com.androidfactory.product.AutomobileProduct;

/**
 * Created by chenmeng on 2018/4/5.
 */

public abstract class AbstractFactory {

    public abstract AutomobileProduct CreatCar();
    public abstract AutomobileProduct CreatTruck();
}
