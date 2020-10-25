package com.example.myapplication.myapplication25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToast(View view) {
        Toast.makeText(this, "Coucou", Toast.LENGTH_SHORT).show();
    }

    public void onClickFoo(View view) {
        MyIntentService.startActionFoo(this, null, null);
    }

    public void onClickBaz(View view) {
        MyIntentService.startActionBaz(this, null, null);
    }
}