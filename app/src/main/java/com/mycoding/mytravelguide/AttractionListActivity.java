package com.mycoding.mytravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class
AttractionListActivity extends AppCompatActivity {
    ListView list;
    String[] names = {
            "Takhat Sachkhand Sri Hazur Abchal Nagar Sahib",
            "Kaleshwar Mandir Vishnupuri",
            "Shri Guru Gobind Singh Ji Museum",
            "Visava Garden",
            "Sahastrakund Waterfall",
            "Kandhar Fort",
            "Gurudwara Nagina Ghat",
            "Nanded Fort",
            "Kandhar Falls"
    };

    String[] address ={
            "Gurudwara Road, Yatri Niwas Rd, Sharda Nagar, Hyder Bagh, Nanded, Maharashtra 431601",
            "Vishnupuri, Nanded-Waghala, Maharashtra 431606",
            "Hingoli Gate Flyover, Vazirabad, Nanded, Maharashtra 431601",
            "Vishnu Nagar, Nanded, Maharashtra 431602",
            "Sahastrakund waterfall Rd, Islapur, Maharashtra 431803",
            "Khilla Road, Nanded",
            "Langer Saheb Rd, Vazirabad, Nanded, Maharashtra 431604",
            "Nanded",
            "Nanded"
    };

    String[] rating = {
            "4.7",
            "4.5",
            "4.6",
            "4.0",
            "4.4",
            "4.1",
            "4.7",
            "4.4",
            "4.5"
    };

    Integer[] ImageId = {
            R.drawable.hazur_sahib,
            R.drawable.kaleshwar_mandir,
            R.drawable.shri_guru_gobind_singhji_museum,
            R.drawable.visava_garden,
            R.drawable.sahastrakund_waterfall,
            R.drawable.kandhar_fort,
            R.drawable.gurudwara_nagina_ghat,
            R.drawable.nanded_fort,
            R.drawable.kandhar_waterfall
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_list);

        CustomList adapter = new CustomList(AttractionListActivity.this, names, address, rating, ImageId);

        list = findViewById(R.id.attraction_list);
        list.setAdapter(adapter);

    }
}