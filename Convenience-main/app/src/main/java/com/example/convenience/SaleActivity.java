package com.example.convenience;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class SaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);
    }

    public void onRToMainClicked(View v)
    {
        Toast.makeText(this, "돌아가기 버튼이 눌렸어요", Toast.LENGTH_LONG).show();
        finish();//화면을 없애주는 역할

    }
}