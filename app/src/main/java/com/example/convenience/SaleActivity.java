package com.example.convenience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class SaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);
    }
    public void onCU_SPEClicked(View v)
    {
        Toast.makeText(this, "CU Special", Toast.LENGTH_LONG).show();
        Intent ACT_spe = new Intent(this,CU_SPE.class);
        startActivity(ACT_spe);
    }
    public void onCU_OPOClicked(View v)
    {
        Toast.makeText(this, "CU 1 + 1", Toast.LENGTH_LONG).show();
        Intent ACT_opo = new Intent(this,CU_OPO.class);
        startActivity(ACT_opo);
    }
    public void onCU_TPOClicked(View v)
    {
        Toast.makeText(this, "CU 2 + 1", Toast.LENGTH_LONG).show();
        Intent ACT_tpo = new Intent(this,CU_TPO.class);
        startActivity(ACT_tpo);
    }


    public void onRToMainClicked(View v)
    {
        Toast.makeText(this, "돌아가기 버튼이 눌렸어요", Toast.LENGTH_LONG).show();
        Intent ACT_Main = new Intent(this,MainActivity.class);
        startActivity(ACT_Main);

    }
    public void onGS25Clicked(View v)
    {
        Toast.makeText(this, "GS25 할인 메뉴", Toast.LENGTH_LONG).show();
        Intent ACT_GS25 = new Intent(this,gs_25.class);
        startActivity(ACT_GS25);
        // finish();//화면을 없애주는 역할
    }
}