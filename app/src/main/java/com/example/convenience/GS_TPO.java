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

public class GS_TPO extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter_gs2 adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<gs_tpo_> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gs_tpo);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        arrayList=new ArrayList<>();

        database = FirebaseDatabase.getInstance("https://convenience-844d2-default-rtdb.firebaseio.com/");

        databaseReference = database.getReference("gs_tpo_");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                arrayList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    gs_tpo_ gs_tpo_=snapshot.getValue(com.example.convenience.gs_tpo_.class);
                    arrayList.add(gs_tpo_);

                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Log.e("GS_TPO", String.valueOf(databaseError.toException()));
            }
        });

        adapter = new CustomAdapter_gs2(arrayList, this);
        recyclerView.setAdapter(adapter);
    }
}