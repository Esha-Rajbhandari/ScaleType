package com.example.esha.scaletype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnCenter;
    private Button btnCenterCrop;
    private Button btnFitXY;
    private Button btnFitCenter;
    private Button btnFitStart;
    private Button btnFitEnd;
    private Button btnCenterInside;
    private Button btnMatrix;
    private Button btnTrueBounds;
    private Button btnFlaseBounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCenter=findViewById(R.id.btn_center);
        btnCenter.setOnClickListener(this);
        btnCenterCrop=findViewById(R.id.btn_center_crop);
        btnCenterCrop.setOnClickListener(this);
        btnFitXY=findViewById(R.id.btn_fitXY);
        btnFitXY.setOnClickListener(this);
        btnFitStart=findViewById(R.id.btn_fit_start);
        btnFitStart.setOnClickListener(this);
        btnFitCenter=findViewById(R.id.btn_fit_center);
        btnFitCenter.setOnClickListener(this);
        btnFitEnd=findViewById(R.id.btn_fit_end);
        btnFitEnd.setOnClickListener(this);
        btnCenterInside=findViewById(R.id.btn_center_inside);
        btnCenterInside.setOnClickListener(this);
        btnMatrix=findViewById(R.id.btn_matrix);
        btnMatrix.setOnClickListener(this);
        btnTrueBounds=findViewById(R.id.btn_true_bounds);
        btnTrueBounds.setOnClickListener(this);
        btnFlaseBounds=findViewById(R.id.btn_false_bounds);
        btnFlaseBounds.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_center:
                Intent intent=new Intent(MainActivity.this, center.class);
                startActivity(intent);
                break;
            case R.id.btn_center_crop:
                Intent intent1=new Intent(MainActivity.this, centerCrop.class);
                startActivity(intent1);
                break;
            case R.id.btn_fitXY:
                Intent intent2=new Intent(MainActivity.this, fitXY.class);
                startActivity(intent2);
                break;
            case R.id.btn_fit_center:
                Intent intent3=new Intent(MainActivity.this, fitCenter.class);
                startActivity(intent3);
                break;
            case R.id.btn_fit_start:
                Intent intent4=new Intent(this, fitStart.class);
                startActivity(intent4);
                break;
            case R.id.btn_fit_end:
                Intent intent6=new Intent(this, fitEnd.class);
                startActivity(intent6);
                break;
            case R.id.btn_center_inside:
                Intent intent7=new Intent(this, fitCenterInside.class);
                startActivity(intent7);
                break;
            case R.id.btn_matrix:
                Intent intent8=new Intent(this, matrix.class);
                startActivity(intent8);
                break;
            case R.id.btn_true_bounds:
                Intent intent9=new Intent(this, trueBounds.class);
                startActivity(intent9);
                break;
            case R.id.btn_false_bounds:
                Intent intent10=new Intent(this, falseBounds.class);
                startActivity(intent10);
                break;
        }
    }
}
