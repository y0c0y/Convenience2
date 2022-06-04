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

public class GS_SPE extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter_gs adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<gs_spe_> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gs_spe);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        arrayList=new ArrayList<>();

        database = FirebaseDatabase.getInstance("https://convenience-844d2-default-rtdb.firebaseio.com/");

        databaseReference = database.getReference("gs_spe_");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                arrayList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    gs_spe_ gs_spe_=snapshot.getValue(com.example.convenience.gs_spe_.class);
                    arrayList.add(gs_spe_);

                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Log.e("GS_SPE", String.valueOf(databaseError.toException()));
            }
        });

        adapter = new CustomAdapter_gs(arrayList, this);
        recyclerView.setAdapter(adapter);
    }
}