package com.mycoding.mytravelguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView hotels, cafe, restaurants, shops, attractions, fun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hotels = (CardView) findViewById(R.id.hotel);
        cafe = (CardView) findViewById(R.id.cafe);
        restaurants = (CardView) findViewById(R.id.rest);
        shops = (CardView) findViewById(R.id.shop);
        attractions = (CardView) findViewById(R.id.attraction);
        fun = (CardView) findViewById(R.id.fun);

        hotels.setOnClickListener(this);
        cafe.setOnClickListener(this);
        restaurants.setOnClickListener(this);
        shops.setOnClickListener(this);
        attractions.setOnClickListener(this);
        fun.setOnClickListener(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null){
            setSupportActionBar(toolbar);
        }

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()){
            case R.id.hotel:
                i = new Intent(MainActivity.this, HotelListActivity.class);
                startActivity(i);
                break;
            case R.id.cafe:
                i = new Intent(MainActivity.this, CafeListActivity.class);
                startActivity(i);
                break;
            case R.id.rest:
                i = new Intent(MainActivity.this, RestListActivity.class);
                startActivity(i);
                break;
            case R.id.shop:
                i = new Intent(MainActivity.this, ShopListActivity.class);
                startActivity(i);
                break;
            case R.id.attraction:
                i = new Intent(MainActivity.this, AttractionListActivity.class);
                startActivity(i);
                break;
            case R.id.fun:
                i = new Intent(MainActivity.this, FunListActivity.class);
                startActivity(i);
                break;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.sign_out){
            FirebaseAuth.getInstance().signOut();
            finish();
        }
        else if (item.getItemId() == R.id.settings){
            Toast.makeText(MainActivity.this, "You have selected the settings", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}