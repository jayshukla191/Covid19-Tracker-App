package com.example.coronaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private  int positionCountry;
    private Context context;

    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvDeaths,tvTodayDeaths;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = new Intent();
        positionCountry=intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of " + AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvActive = findViewById(R.id.tvActive);
        tvCases = findViewById(R.id.tvCases);
        tvCountry = findViewById(R.id.tvCountry);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvDeaths = findViewById(R.id.tvDeaths);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());

//        Glide.with(context).load(AffectedCountries.countryModelList.get(positionCountry).getFlag()).into(imgView);
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayDeaths());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayCases());
        tvDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());




    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
