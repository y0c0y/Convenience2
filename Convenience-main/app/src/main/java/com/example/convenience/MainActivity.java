package com.example.convenience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaleClicked(View v)
    {
        Toast.makeText(this, "세일 정보 화면",Toast.LENGTH_LONG).show();

        Intent ACT_Sale = new Intent(this,SaleActivity.class);
        startActivity(ACT_Sale);
    }

    public void onMapsClicked(View v)
    {
        Toast.makeText(this, "위치 정보 화면",Toast.LENGTH_LONG).show();

        Intent ACT_Maps = new Intent(this,MapsActivity.class);
        startActivity(ACT_Maps);
    }





}