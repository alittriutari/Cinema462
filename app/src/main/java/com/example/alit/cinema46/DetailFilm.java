package com.example.alit.cinema46;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFilm extends AppCompatActivity {
    ImageView imgFilm;
    TextView txtJudulFilm;
    TextView txtDuration;
    TextView txtRated;
    TextView txtGenre;
    TextView txtDescription;
    Button btnBooking;
    String judulfilm="Anonymous";
    String durasi="Anonymous";
    String rated="Anonymous";
    String genre="Anonymous";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_film);

        txtJudulFilm = (TextView) findViewById(R.id.txtJudulFilm);
        txtDuration = (TextView) findViewById(R.id.txtDuration);
        txtRated = (TextView) findViewById(R.id.txtRated);
        txtGenre = (TextView) findViewById(R.id.txtGenre);
        txtDescription = (TextView) findViewById(R.id.txtDescription);
        btnBooking = (Button) findViewById(R.id.btnBooking);
        imgFilm = (ImageView) findViewById(R.id.imageJus);

        String filmTitle=getIntent().getStringExtra("film title");

        if(filmTitle.equals("JUSTICE LEAGUE")){
            imgFilm.setImageResource(R.drawable.just);
            judulfilm= "JUSTICE LEAGUE";
            durasi= "120 minutes";
            rated="13+";
            genre="ACTION, ADVENTURE, FANTASY";
        }else if (filmTitle.equals("THOR : RAGNAROK")) {
            imgFilm.setImageResource(R.drawable.thor);
            judulfilm= "THOR : RAGNAROK";
            durasi= "130 minutes";
            rated="13+";
            genre="ACTION, ADVENTURE";
        }else if (filmTitle.equals("STAR WARS : THE LAST JEDI")){
            imgFilm.setImageResource(R.drawable.jedi);
            judulfilm= "STAR WARS : THE LAST JEDI";
            durasi= "153 minutes";
            rated="13+";
            genre="ACTION, ADVENTURE";
        }else if (filmTitle.equals("JUMANJI : WELCOME TO THE JUNGLE")){
            imgFilm.setImageResource(R.drawable.jumanji);
            judulfilm= "JUMANJI : WELCOME TO THE JUNGLE";
            durasi= "118 minutes";
            rated="13+";
            genre="ACTION, ADVENTURE, FANTASY";
        }else if (filmTitle.equals("MURDER ON THE ORIENT EXPRESS")){
            imgFilm.setImageResource(R.drawable.murder);
            judulfilm= "MURDER ON THE ORIENT EXPRESS";
            durasi= "118 minutes";
            rated="13+";
            genre="MISTERY";
        }else if (filmTitle.equals("SI JUKI THE MOVIE")){
            imgFilm.setImageResource(R.drawable.sijuki);
            judulfilm= "SI JUKI THE MOVIE";
            durasi= "118 minutes";
            rated="13+";
            genre="ACTION, ADVENTURE, FANTASY";
        }
        else if (filmTitle.equals("FERDINAND")){
            imgFilm.setImageResource(R.drawable.ferdinand);
            judulfilm= "FERDINAND";
            durasi= "118 minutes";
            rated="13+";
            genre="ACTION, ADVENTURE, FANTASY";

        }else if (filmTitle.equals("AJIN")){
            imgFilm.setImageResource(R.drawable.ajin);
            judulfilm= "AJIN";
            durasi= "118 minutes";
            rated="13+";
            genre="ACTION, ADVENTURE, FANTASY";

        }else if (filmTitle.equals("YOUR NAME")){
            imgFilm.setImageResource(R.drawable.your);
            judulfilm= "YOUR NAME";
            durasi= "118 minutes";
            rated="13+";
            genre="ACTION, ADVENTURE, FANTASY";

        }

        txtJudulFilm.setText(filmTitle);
        txtDuration.setText(durasi);
        txtRated.setText(rated);
        txtGenre.setText(genre);

        String deskripsi="Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry\\'s standard dummy " +
                "text ever since the 1500s, when an unknown printer took " +
                "a galley of type and scrambled it to make a type specimen book.";
        txtDescription.setText(deskripsi);

        btnBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bookingIntent=new Intent(
                        DetailFilm.this,
                        Booking.class);

                bookingIntent.putExtra("lala", genre); //lala=nama variabel, bebas penamaannya
                startActivity(bookingIntent);
            }
        });
    }
}
