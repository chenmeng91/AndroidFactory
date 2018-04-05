package ne.megvii.com.androidfactory.factory;

import ne.megvii.com.androidfactory.product.AutomobileProduct;
import ne.megvii.com.androidfactory.product.CarProduct;
import ne.megvii.com.androidfactory.product.TruckProduct;

/**
 * Created by chenmeng on 2018/4/5.
 */

public class AbstractFactoryImp extends AbstractFactory {
    @Override
    public AutomobileProduct CreatCar() {
        return new CarProduct();
    }

    @Override
    public AutomobileProduct CreatTruck() {
        return new TruckProduct();
    }
}
