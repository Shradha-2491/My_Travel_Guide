package com.mycoding.mytravelguide;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] title;
    private final String[] address;
    private final String[] rating;
    private final Integer[] imageId;

    public CustomList(Activity context, String[] title, String[] address, String[] rating, Integer[] imageId){
        super(context, R.layout.custom_list, title);
        this.context = context;
        this.title = title;
        this.address = address;
        this.rating = rating;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater =context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_list, null, true);
        TextView txtTitle = rowView.findViewById(R.id.textViewTitle);
        TextView txtAddress = rowView.findViewById(R.id.textViewSubTitle);
        TextView txtRating = rowView.findViewById(R.id.textViewRating);
        ImageView imageView = rowView.findViewById(R.id.imageView);

        txtTitle.setText(title[position]);
        txtAddress.setText(address[position]);
        txtRating.setText(rating[position]);
        imageView.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("key", title[position]);
                context.startActivity(intent);
            }
        });

        return rowView;
    }
}
