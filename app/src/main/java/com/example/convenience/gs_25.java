package com.example.convenience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class gs_25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gs25);
    }

    public void onCUClicked(View v)
    {
        Toast.makeText(this, "CU 할인 메뉴", Toast.LENGTH_LONG).show();
        Intent ACT_CU = new Intent(this,SaleActivity.class);
        startActivity(ACT_CU);
        // finish();//화면을 없애주는 역할
    }

    public void onRToMainClicked(View v)
    {
        Toast.makeText(this, "돌아가기 버튼이 눌렸어요", Toast.LENGTH_LONG).show();
        Intent ACT_Main = new Intent(this,MainActivity.class);
        startActivity(ACT_Main);

    }
}