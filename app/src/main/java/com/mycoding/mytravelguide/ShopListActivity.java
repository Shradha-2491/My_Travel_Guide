package com.mycoding.mytravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ShopListActivity extends AppCompatActivity {

    ListView list;
    String[] names = {"Raj mall",
            "Centre Point Nanded",
            "Bombay Shopping Center",
            "Fashion Stuff",
            "Nanded Square - Shopping Mall",
            "Treasure Bazaar mall",
            "Gable Handloom",
            "Ghar Sansar Mahasale",
            "Dwarka SHOPPING MALL"
    };

    String[] address ={
            "Nanded Malegaon Rd, Ayodya Nagri, Nanded, Maharashtra 431605",
            "Shivaji Nagar Nai Abaadi, Gokul Nagar, Nanded, Maharashtra 431602",
            "Vivek Nagar, Vishnu Nagar, Nanded, Maharashtra 431602",
            "Dhanvantri Colony, Waman Nagar, Nanded, Maharashtra 431605",
            "Opp. IG Office, New, Latur-Nanded Hwy, Kautha, Nanded, Maharashtra 431606",
            "New kautha, Nanded, Maharashtra 431746",
            "Mahatma Gandhi Rd, Old Mondha, Hyder Bagh, Dashmesh Nagar, Harsh Nagar, Nanded, Maharashtra 431604",
            "Kalamandir, Khadakpura, Nanded, Maharashtra 431601",
            "Samrat Nagar, Hyder Bagh, Dashmesh Nagar, Harsh Nagar, Nanded-Waghala, Maharashtra 431601"
    };

    String[] rating = {
            "4.3",
            "4.0",
            "4.0",
            "5.0",
            "3.9",
            "3.7",
            "4.1",
            "3.4",
            "3.3"
    };

    Integer[] ImageId = {
            R.drawable.raj_mall,
            R.drawable.centre_point,
            R.drawable.bombay_shopping,
            R.drawable.fashion_stuff,
            R.drawable.nanded_square,
            R.drawable.treasure_bazaar,
            R.drawable.gable_handloom,
            R.drawable.ghar_sansar,
            R.drawable.dwark_shopping
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);

        CustomList adapter = new CustomList(ShopListActivity.this, names, address, rating, ImageId);

        list = findViewById(R.id.shop_list);
        list.setAdapter(adapter);

    }
}