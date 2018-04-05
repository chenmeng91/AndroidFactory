package ne.megvii.com.androidfactory.factory;

import ne.megvii.com.androidfactory.product.AutomobileProduct;
import ne.megvii.com.androidfactory.product.CarProduct;

/**
 * Created by chenmeng on 2018/4/5.
 */

public class CarFactory extends FactoryMethodFactory {
    @Override
    public AutomobileProduct creatAutomobileProduct() {
        return new CarProduct();
    }
}
