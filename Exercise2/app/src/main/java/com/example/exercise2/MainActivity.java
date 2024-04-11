package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onRadBtnClicked(View view) {
        ConstraintLayout frameLayout = (ConstraintLayout) findViewById(R.id.frameLayout);

        if (view.getId() == R.id.redRadBtn) {
            frameLayout.setBackgroundColor(Color.RED);
        } else if (view.getId() == R.id.greenRadBtn) {
            frameLayout.setBackgroundColor(Color.GREEN);
        } else if (view.getId() == R.id.blueRadBtn) {
            frameLayout.setBackgroundColor(Color.BLUE);
        } else if (view.getId() == R.id.grayRadBtn) {
            frameLayout.setBackgroundColor(Color.GRAY);
        }
    }

}