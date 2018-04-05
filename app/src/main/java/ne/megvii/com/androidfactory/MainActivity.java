package ne.megvii.com.androidfactory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button simple_factory;
    Button factory_method;
    Button abstroct_factory_method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simple_factory = findViewById(R.id.simple_factory);
        factory_method = findViewById(R.id.factory_method);
        abstroct_factory_method = findViewById(R.id.abstroct_factory_method);
        simple_factory.setOnClickListener(this);
        factory_method.setOnClickListener(this);
        abstroct_factory_method.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.simple_factory:
                Intent intent1 = new Intent(MainActivity.this, SimpleFactoryActivity.class);
                startActivity(intent1);
                break;
            case R.id.factory_method:
                Intent intent2 = new Intent(MainActivity.this, FactoryMethodActivity.class);
                startActivity(intent2);
                break;
            case R.id.abstroct_factory_method:
                Intent intent3 = new Intent(MainActivity.this, AbstractFactoryActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
