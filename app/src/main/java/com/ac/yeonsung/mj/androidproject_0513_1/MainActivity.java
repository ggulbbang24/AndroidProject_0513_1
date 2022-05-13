package com.ac.yeonsung.mj.androidproject_0513_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearPink, linearPurple, linearSkyblue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        linearPink = findViewById(R.id.linear_pink);
        linearPurple = findViewById(R.id.linear_purple);
        linearSkyblue = findViewById(R.id.linear_skyblue);

        Button btnPink = findViewById(R.id.btn_pink);
        Button btnPurple = findViewById(R.id.btn_purple);
        Button btnSkyblue = findViewById(R.id.btn_skyblue);

        btnPink.setOnClickListener(btnListener);
        btnPurple.setOnClickListener(btnListener);
        btnSkyblue.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            linearPink.setVisibility(View.INVISIBLE);
            linearPurple.setVisibility(View.INVISIBLE);
            linearSkyblue.setVisibility(View.INVISIBLE);

            switch (view.getId()) {
                case R.id.btn_pink:
                    linearPink.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_purple:
                    linearPurple.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_skyblue:
                    linearSkyblue.setVisibility(View.VISIBLE);
                    break;

            }
        }
    };
}