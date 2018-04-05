package ne.megvii.com.androidfactory;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import ne.megvii.com.androidfactory.factory.FactoryMethodFactory;
import ne.megvii.com.androidfactory.factory.CarFactory;
import ne.megvii.com.androidfactory.factory.TruckFactory;

/**
 * Created by chenmeng on 2018/4/5.
 */

public class FactoryMethodActivity extends Activity implements View.OnClickListener {
    Button first;
    Button second;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        first.setOnClickListener(this);
        second.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first:
                FactoryMethodFactory abstractFactory1 = new CarFactory();
                abstractFactory1.creatAutomobileProduct().drive();

                break;
            case R.id.second:
                FactoryMethodFactory abstractFactory2 = new TruckFactory();
                abstractFactory2.creatAutomobileProduct().drive();

                break;
        }
    }
}
