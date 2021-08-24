package com.mycoding.mytravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FunListActivity extends AppCompatActivity {
    ListView list;
    String[] names = {
            "Guru Gobind Bagh Amusement Park",
            "Fun zone",
            "Shri Guru Har Krishan Sahib Ji Children's Park",
            "Gurudwara Garden",
            "Gurudawara Gobind Bagh",
            "Kaleshwar Mandir Park",
            "Shri Guru Gobind Singh Ji Museum park",
            "PVR Cinemas",
            "First Love Garden",
            "Heera Moti Fish Aquarium"
    };

    String[] address ={
            "Samrat Nagar, Hyder Bagh, Dashmesh Nagar, Harsh Nagar, Nanded-Waghala, Maharashtra 431601",
            "MHADA Colony, Nanded, Maharashtra 431603",
            "Bhagat Singh Rd, Samrat Nagar, Hyder Bagh, Dashmesh Nagar, Harsh Nagar, Nanded, Maharashtra 431601",
            "angad devji, Yatri Niwas Rd, Sharda Nagar, Hyder Bagh, Dashmesh Nagar, Harsh Nagar, Nanded, Maharashtra 431601",
            "Govind Bagh Rd, Samrat Nagar, Hyder Bagh, Dashmesh Nagar, Harsh Nagar, Nanded, Maharashtra 431601",
            "Vishnupuri, Nanded, Maharashtra 431606",
            "Hingoli Gate Flyover, Vazirabad, Nanded, Maharashtra 431601",
            "2nd Floor, Nanded square Mall, Latur Nanded Rd, Vasarani, MHADA Colony, Nanded, Maharashtra 431606",
            "Vishnu Nagar, Nanded, Maharashtra 431602",
            "1st Floor, Gurukrupa Market, Mahavir Chowk, above Latur Urban Co Op Bank, Nanded, Maharashtra 431601"
    };

    String[] rating = {
            "4.3",
            "5.0",
            "4.3",
            "4.6",
            "4.6",
            "4.2",
            "4.7",
            "4.0",
            "4.7",
            "4.3"
    };

    Integer[] ImageId = {
            R.drawable.guru_gobind_bagh,
            R.drawable.fun_zone,
            R.drawable.shri_guru_har_krishan_sahibji,
            R.drawable.gurdwara_garden,
            R.drawable.gurdwara_gobind_bagh,
            R.drawable.kaleshwar_mandir_park,
            R.drawable.shri_guru_gobind_singhji,
            R.drawable.pvr_cinemas,
            R.drawable.first_love_garden,
            R.drawable.heera_moti_fish
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_list);

        CustomList adapter = new CustomList(FunListActivity.this, names, address, rating, ImageId);

        list = findViewById(R.id.fun_list);
        list.setAdapter(adapter);

    }
}