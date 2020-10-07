package com.example.a929;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent2=getIntent();
        bundle=intent2.getExtras();

        Integer age=bundle.getInt("age");
        String string=bundle.getString("name");

        Toast.makeText(this,age.toString(),Toast.LENGTH_LONG).show();
    }
}