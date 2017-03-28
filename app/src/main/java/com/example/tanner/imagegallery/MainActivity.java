package com.example.tanner.imagegallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public final Integer image_ids[] = {
            R.drawable.longboard11,
            R.drawable.longboard12,
            R.drawable.longboard13,
            R.drawable.longboard14,
            R.drawable.longboard15,

            R.drawable.longboard21,
            R.drawable.longboard22,
            R.drawable.longboard23,
            R.drawable.longboard24,
            R.drawable.longboard25,

            R.drawable.longboard31,
            R.drawable.longboard32,
            R.drawable.longboard33,
            R.drawable.longboard34,
            R.drawable.longboard35,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.imagegallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<CreateList> createLists = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);


    }
    private ArrayList<CreateList> prepareData() {
        ArrayList<CreateList> theimage = new ArrayList<>();
        for (int i = 0; i< image_ids.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_ID(image_ids[i]);
            theimage.add(createList);
        }
        return theimage;
    }




}


