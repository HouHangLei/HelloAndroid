package cn.com.houhanglei.healloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ImageView imgV = (ImageView) findViewById(R.id.imgView);
        imgV.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                TestActivity.this.finish();
            }
        });

    }
}
