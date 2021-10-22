package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("HELLO");
    }

    public void onBtnClick(View view){
        TextView txt1 = findViewById(R.id.textView);
        String str = txt1.getText().toString();
        int counter = Integer.parseInt(str);
        counter++;
        str = Integer.toString(counter);
        txt1.setText(str);
    }

    public void onBtn2Click(View view){
        TextView txt1 = findViewById(R.id.textView);
        txt1.setText("0");
    }


}