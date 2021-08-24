package com.mycoding.mytravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CafeListActivity extends AppCompatActivity {

    ListView list;
    String[] names = {
            "Club De Cafe",
            "Coffee All Day",
            "Honey Bunny Cafe",
            "Amrut Cafe",
            "Cafe Choco Craze",
            "Hmmm.. Cafe",
            "THE CAVES CAFE",
            "Cafe Cappuccino",
            "Shama Cafe",
            "Think Cafe",
            "#Friends cafe",
            "Coffee Junction"
    };

    String[] address ={
            "2, Bhagya nagar, Irrigation Colony, Peer Burhan Nagar, Nanded, Maharashtra 431605",
            "Vivek Nagar, Vishnu Nagar, Nanded, Maharashtra 431602",
            "Sai Heights, Vivek Nagar, Vishnu Nagar, Nanded-Waghala, Maharashtra 431602",
            "near Jawa showroom, Vasant Nagar, Hyder Bagh, Dashmesh Nagar, Harsh Nagar, Nanded, Maharashtra 431601",
            "Opp. Savitribai Phule High School, Yashwant College Road, Baba Nagar, Nanded, Maharashtra 431602",
            "Tirumala Nagar, Nanded, Maharashtra 431605",
            "Nanded Bypass Rd, Ashtvinayak Nagar, Nanded, Maharashtra 431605",
            "BK Hall, Vivek Nagar, Nanded, Maharashtra 431605",
            "Beside Masjid -e-khazra Workshop Road Nizam Colony, Nanded, Maharashtra 431605",
            "Parsewar complex,Back side of bharat gas agency, new mondha, Nanded, Maharashtra 431602",
            "opp. to Sggsie&t, Vishnupuri, Nanded, Maharashtra 431606",
            "giriraj complex shop no 10 .., Chhatrapati Chowk to Kabra Nagar Rd, near Ambika Mangal Karyalaya, Nanded, Maharashtra"
    };

    String[] rating = {
            "4.4",
            "4.2",
            "4.8",
            "4.3",
            "4.2",
            "4.3",
            "4.3",
            "4.3",
            "4.0",
            "4.1",
            "4.1",
            "5.0"
    };

    Integer[] ImageId = {
            R.drawable.cafe1,
            R.drawable.cafe2,
            R.drawable.cafe3,
            R.drawable.cafe4,
            R.drawable.cafe5,
            R.drawable.cafe6,
            R.drawable.cafe7,
            R.drawable.cafe8,
            R.drawable.cafe9,
            R.drawable.cafe10,
            R.drawable.cafe11,
            R.drawable.cafe12
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_list);

        CustomList adapter = new CustomList(CafeListActivity.this, names, address, rating, ImageId);

        list = findViewById(R.id.cafe_list);
        list.setAdapter(adapter);

    }
}