package com.example.convenience;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentManager;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private FragmentManager fragmentManager;
    private MapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        fragmentManager = getFragmentManager();
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.Convenience2);
        mapFragment.getMapAsync(this::onMapReady);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        //반복 - cu1
        LatLng location1 = new LatLng(37.5510150,127.0756810);
        MarkerOptions markerOptions1 = new MarkerOptions();
        markerOptions1.title("CU세종대대양AI센터점");
        markerOptions1.position(location1);
        markerOptions1.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        googleMap.addMarker(markerOptions1);

        //2
        LatLng location2 = new LatLng(37.5591666,127.0752777);
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.title("CU광진군자교점");
        markerOptions2.position(location2);
        markerOptions2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        googleMap.addMarker(markerOptions2);

        //3
        LatLng location3 = new LatLng(37.5516666,127.0711111);
        MarkerOptions markerOptions3 = new MarkerOptions();
        markerOptions3.title("CU광진군자로점");
        markerOptions3.position(location3);
        markerOptions3.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        googleMap.addMarker(markerOptions3);

        //4
        LatLng location4 = new LatLng(37.5502777,127.0697222);
        MarkerOptions markerOptions4 = new MarkerOptions();
        markerOptions4.title("CU군자동일로점");
        markerOptions4.position(location4);
        markerOptions4.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        googleMap.addMarker(markerOptions4);

        //5
        LatLng location5 = new LatLng(37.5566666,127.0761111);
        MarkerOptions markerOptions5 = new MarkerOptions();
        markerOptions5.title("CU군자본점");
        markerOptions5.position(location5);
        markerOptions5.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        googleMap.addMarker(markerOptions5);

        //6
        LatLng location6 = new LatLng(37.5558333,127.0733333);
        MarkerOptions markerOptions6 = new MarkerOptions();
        markerOptions6.title("CU군자오거리점");
        markerOptions6.position(location6);
        markerOptions6.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        googleMap.addMarker(markerOptions6);

        //7
        LatLng location7 = new LatLng(37.5569444,127.0772222);
        MarkerOptions markerOptions7 = new MarkerOptions();
        markerOptions7.title("CU군자중앙점");
        markerOptions7.position(location7);
        markerOptions7.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        googleMap.addMarker(markerOptions7);

        //8
        LatLng location8 = new LatLng(37.5533333,127.0736111);
        MarkerOptions markerOptions8 = new MarkerOptions();
        markerOptions8.title("CU세종대후문점");
        markerOptions8.position(location8);
        markerOptions8.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        googleMap.addMarker(markerOptions8);

        //9
        LatLng location9 = new LatLng(37.5544444,127.0777777);
        MarkerOptions markerOptions9 = new MarkerOptions();
        markerOptions9.title("GS25S군자역점");
        markerOptions9.position(location9);
        markerOptions9.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(markerOptions9);

        //10
        LatLng location10 = new LatLng(37.5544444,127.0775);
        MarkerOptions markerOptions10 = new MarkerOptions();
        markerOptions10.title("GS25군자능동점");
        markerOptions10.position(location10);
        markerOptions10.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(markerOptions10);

        //11
        LatLng location11 = new LatLng(37.5547222,127.0713888);
        MarkerOptions markerOptions11 = new MarkerOptions();
        markerOptions11.title("GS25군자동일로점");
        markerOptions11.position(location11);
        markerOptions11.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(markerOptions11);

        //12
        LatLng location12 = new LatLng(37.5663888,127.0694444);
        MarkerOptions markerOptions12 = new MarkerOptions();
        markerOptions12.title("GS25군자본점");
        markerOptions12.position(location12);
        markerOptions12.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(markerOptions12);

        //13
        LatLng location13 = new LatLng(37.5488888,127.0719444);
        MarkerOptions markerOptions13 = new MarkerOptions();
        markerOptions13.title("GS군자원룸점");
        markerOptions13.position(location13);
        markerOptions13.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(markerOptions13);

        //14
        LatLng location14 = new LatLng(37.5569444,127.0766666);
        MarkerOptions markerOptions14 = new MarkerOptions();
        markerOptions14.title("GS25군자중앙점");
        markerOptions14.position(location14);
        markerOptions14.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(markerOptions14);

        //15
        LatLng location15 = new LatLng(37.5541666,127.0747222);
        MarkerOptions markerOptions15 = new MarkerOptions();
        markerOptions15.title("GS25군자행운점");
        markerOptions15.position(location15);
        markerOptions15.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(markerOptions15);

        //15
        LatLng location16 = new LatLng(37.5644444,127.0727777);
        MarkerOptions markerOptions16 = new MarkerOptions();
        markerOptions16.title("GS25화양세종점");
        markerOptions16.position(location16);
        markerOptions16.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(markerOptions16);


        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location1,16));
    }
}
