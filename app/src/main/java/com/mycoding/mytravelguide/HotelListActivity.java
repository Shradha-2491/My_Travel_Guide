package com.mycoding.mytravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class HotelListActivity extends AppCompatActivity {

    ListView list;
    String[] names = {"Hotel Sourabh",
            "Hotel Tulsi Comfort",
            "Visawa Palace",
            "Hotel Uma",
            "Hotel Ramakrishna International",
            "Hotel Chandralok",
            "Hotel Pooja Garden",
            "Hotel CVR",
            "Hotel City Pride",
            "Hotel Galaxy",
            "Hotel ICON",
            "Hotel Rajyog",
            "Hotel Grand Maratha"
    };

    String[] address ={
            "Nanded Malegaon Road, Near Jain Mandir, Nanded 431605 India",
            "19, Tilak Nagar, Bhagya Nagar Road, Nanded 431605 India",
            "Behind Shivaji Nagar Police Station Oppo. Nana-Nani Park, Nanded 431602 India",
            "Lokhande Complex, Shivaji Nagar, Besides SBH Bank Near State Bank Of Hyderabad, Nanded 431602 India",
            "Dr Lane Near Bus Stand, Nanded 413601 India",
            "Airport Road Hingoli Circle, Nanded 431602 India",
            "near Latur Fata, Major State Highway 3, MHADA Colony, Nanded 431603 India",
            "Wadiya Factory Area, Ashwini Hospital, Shivaji Nagar, Nanded, Maharashtra, 431602",
            "Airport Road, Near Hanumangadh Kaman beside Ujwal Enterprises, Nanded 431605 India",
            "opp. to Dr. Shankarrao Chavan Medical College, Vishnupuri, Nanded, Maharashtra 431605",
            "near center point, Shivaji Putala, Vazirabad, Nanded, Maharashtra 431605",
            "MGM, Devashish Tower, NAMSKAR CHOUK, College Road, Nanded, Maharashtra 431605",
            "Chhatrapati Chowk to Kabra Nagar Rd, Tirumala Nagar, Nanded, Maharashtra 431605"
    };

    String[] rating = {
            "4.0",
            "4.3",
            "4.1",
            "4.0",
            "3.9",
            "4.1",
            "3.9",
            "4.9",
            "5.0",
            "4.5",
            "4.6",
            "4.1",
            "3.7"
    };

    Integer[] ImageId = {
            R.drawable.hotel_sourabh,
            R.drawable.hotel_tulsi,
            R.drawable.hotel_visawa,
            R.drawable.hotel_uma,
            R.drawable.hotel_ramakrishna,
            R.drawable.hotel_chandralok,
            R.drawable.hotel_pooja,
            R.drawable.hotel_cvr,
            R.drawable.hotel_city_pride,
            R.drawable.hotel_galaxy,
            R.drawable.hotel_icon,
            R.drawable.hotel_rajyog,
            R.drawable.hotel_grand_maratha
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        CustomList adapter = new CustomList(HotelListActivity.this, names, address, rating, ImageId);

        list = findViewById(R.id.hotel_list);
        list.setAdapter(adapter);

    }
}