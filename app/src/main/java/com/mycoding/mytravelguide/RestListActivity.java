package com.mycoding.mytravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class RestListActivity extends AppCompatActivity {

    ListView list;
    String[] names = {
            "Blue Basil- Restaurant by Eatos",
            "5 STAR FAMILY RESTAURANT",
            "Madhur Bhoj",
            "Swaraj Family Garden And Restaurent",
            "Hotel Radhakrishna Pure Veg",
            "Dalchini",
            "Bobby Restaurant",
            "HOTEL JAIDHAN VEG REST. & LODGING",
            "Hotel Zaika",
            "Atmosphere Pure Veg Restaurant & Cafe",
            "Sunder Hotel"
    };

    String[] address ={
            "19, Tilak Nagar, Anand Nagar, Nanded, Maharashtra 431601",
            "traffic signal, near workshop, Kohinor City, Shri Nagar, Nanded, Maharashtra 431602",
            "ITI Godavari Complex, VIP Rd, Industrial Estate, Vishnu Nagar, Nanded, Maharashtra 431602",
            "Bypass Rd, Kamtha Village, Nanded, Maharashtra 431605",
            "D Mart Rd, near Chandoji Pawade Magalkaryalay, Tirumala Nagar, Nanded, Maharashtra 431605",
            "Dyaneshwer Nagar, Tirumala Nagar, Nanded, Maharashtra 431605",
            "Yadav Complex, Besides Bank of, Workshop Rd, Nanded, Maharashtra 431605",
            "Opp. Mahatma Phule Mangal Karyalay Industrial Estate, Guru Gobind Singh Ji Rd, Nanded, Maharashtra 431602",
            "11-9-877, VIP Rd, Visavanagar Colony, Vishnu Nagar, Nanded, Maharashtra 431602",
            "2nd Floor Suyash height opp. ITI Petrol Pump, VIP Rd, Nanded, Maharashtra 431602",
            "Gurudwara Road, Gate No: 1, opp. Hanuman Temple, Nanded, Maharashtra 431601"
    };

    String[] rating = {
            "4.1",
            "4.2",
            "4.1",
            "4.9",
            "4.8",
            "4.2",
            "4.4",
            "4.4",
            "4.0",
            "4.0",
            "4.1"
    };

    Integer[] ImageId = {
            R.drawable.rest1,
            R.drawable.rest2,
            R.drawable.rest3,
            R.drawable.rest4,
            R.drawable.rest5,
            R.drawable.rest6,
            R.drawable.rest7,
            R.drawable.rest8,
            R.drawable.rest9,
            R.drawable.rest10,
            R.drawable.rest11
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_list);

        CustomList adapter = new CustomList(RestListActivity.this, names, address, rating, ImageId);

        list = findViewById(R.id.rest_list);
        list.setAdapter(adapter);

    }
}