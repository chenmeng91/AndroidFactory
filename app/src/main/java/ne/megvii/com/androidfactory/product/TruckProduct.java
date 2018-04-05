package ne.megvii.com.androidfactory.product;

import android.util.Log;

/**
 * Created by chenmeng on 2018/4/5.
 */

public class TruckProduct extends AutomobileProduct {
    @Override
    public void drive() {
        Log.d("AutomobileProduct","我正在驾驶Truck");
    }
}
