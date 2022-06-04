package com.example.convenience;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class GS_OPO extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter_gs1 adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<gs_opo_> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gs_opo);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        arrayList=new ArrayList<>();

        database = FirebaseDatabase.getInstance("https://convenience-844d2-default-rtdb.firebaseio.com/");

        databaseReference = database.getReference("gs_opo_");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                arrayList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    gs_opo_ gs_opo_=snapshot.getValue(com.example.convenience.gs_opo_.class);
                    arrayList.add(gs_opo_);

                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Log.e("GS_OPO", String.valueOf(databaseError.toException()));
            }
        });

        adapter = new CustomAdapter_gs1(arrayList, this);
        recyclerView.setAdapter(adapter);
    }
}