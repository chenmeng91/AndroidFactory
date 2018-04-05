package ne.megvii.com.androidfactory.factory;

import ne.megvii.com.androidfactory.product.AutomobileProduct;
import ne.megvii.com.androidfactory.product.CarProduct;
import ne.megvii.com.androidfactory.product.TruckProduct;

/**
 * Created by chenmeng on 2018/4/5.
 */

public class SimpleFactory {


    public static AutomobileProduct creatAutomobileProduct(int typle) {

        AutomobileProduct product = null;
        switch (typle) {
            case 1:
                product = new CarProduct();
                break;
            case 2:
                product = new TruckProduct();
                break;
        }

        return product;
    }
}
