package com.example.tapcount;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private MyCounter count;
    private TextView countView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = new MyCounter();

        countView = (TextView) findViewById(R.id.textview1);
    }
    public void countTap(View view){
        count.addCount();
        countView.setText(count.getCount().toString());
    }
    public void countR(View view){
        count.setZero();
        countView.setText(count.getCount().toString());
    }

    public void subTap (View view){
        count.MinusCount();
        countView.setText(count.getCount().toString());
    }

}