package com.example.android.movieproject;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by carolinestewart on 5/6/16.
 */
public class DetailsActivity extends AppCompatActivity {
    private TextView titleTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_view);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        String title = getIntent().getStringExtra("title");
        String image = getIntent().getStringExtra("image");

        titleTextView = (TextView) findViewById(R.id.title);
        imageView = (ImageView) findViewById(R.id.movie_grid_image);

        titleTextView.setText(Html.fromHtml(title));

        Picasso.with(this).load(image).into(imageView);

    }



}
