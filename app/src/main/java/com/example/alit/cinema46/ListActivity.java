package com.example.alit.cinema46;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    ListView listFilm;
    List<String> arrayFilm = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listFilm=(ListView) findViewById(R.id.listFilm);

        final String[] staticFilmTitle = new String[]{
                "JUSTICE LEAGUE",
                "THOR : RAGNAROK",
                "STAR WARS : THE LAST JEDI",
                "JUMANJI : WELCOME TO THE JUNGLE",
                "MURDER ON THE ORIENT EXPRESS",
                "YOUR NAME",
                "SI JUKI THE MOVIE",
                "FERDINAND",
                "AJIN"
        };


        for (int i=0;i<staticFilmTitle.length;i++){
            arrayFilm.add(staticFilmTitle[i]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1, arrayFilm
        );

        listFilm.setAdapter(adapter);

        listFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = staticFilmTitle[i];

                Intent detailFilmIntent= new Intent(ListActivity.this,DetailFilm.class);
                detailFilmIntent.putExtra("film title", selectedItem);
                startActivity(detailFilmIntent);
//
//                Toast.makeText(ListActivity.this, selectedItem, Toast.LENGTH_SHORT).show();
            }
        });



    }
}

