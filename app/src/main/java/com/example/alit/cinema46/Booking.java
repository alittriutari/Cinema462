package com.example.alit.cinema46;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Booking extends AppCompatActivity {

    Spinner spMovie;
    Spinner spCinema;
    Spinner spDate;
    Spinner spTime;
    Button btnLanjut;
    TextView txtPrice;
    String price="35000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        spMovie=(Spinner) findViewById(R.id.spMovie);
        spCinema=(Spinner) findViewById(R.id.spCinema);
        spDate=(Spinner) findViewById(R.id.spDate);
        spTime=(Spinner) findViewById(R.id.spTime);
        btnLanjut=(Button) findViewById(R.id.btnLanjut);
        txtPrice= (TextView) findViewById(R.id.txtPrice);

        String filmTitle =getIntent().getStringExtra("lala");

        //mengisi data spinner
        ArrayAdapter<CharSequence> adapterMovie = ArrayAdapter.createFromResource(
                this,R.array.spinner_movie,
                android.R.layout.simple_spinner_item);

        adapterMovie.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapterCinema = ArrayAdapter.createFromResource(
                this,R.array.spinner_cinema,
                android.R.layout.simple_spinner_item);

        adapterCinema.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapterDate = ArrayAdapter.createFromResource(
                this,R.array.spinner_date,
                android.R.layout.simple_spinner_item);

        adapterDate.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapterTime = ArrayAdapter.createFromResource(
                this,R.array.spinner_time,
                android.R.layout.simple_spinner_item);

        adapterTime.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spMovie.setAdapter(adapterMovie);
        spCinema.setAdapter(adapterCinema);
        spDate.setAdapter(adapterDate);
        spTime.setAdapter(adapterTime);
        txtPrice.setText(price);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String movie=spMovie.getSelectedItem().toString();
                String cinema=spCinema.getSelectedItem().toString();
                String date=spDate.getSelectedItem().toString();
                String time=spTime.getSelectedItem().toString();
                String price=txtPrice.getText().toString();

                AlertDialog.Builder kotakDialog= new AlertDialog.Builder(Booking.this);
                kotakDialog.setTitle("Succesfully booking film");
                kotakDialog.setMessage("You booking "+movie+" in "+cinema+" with show time "+date+", "+time+" and cost "+price);

                //mengatur tombol OK
                kotakDialog.setPositiveButton("OK",null);

                //create and show message dialog
                AlertDialog dialog = kotakDialog.create();
                dialog.show();
            }
        });

    }
}
