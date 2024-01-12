package com.example.signify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

//        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // Create dummy data for carousel items
//        List<CarouselItem> items = new ArrayList<>();
//        items.add(new CarouselItem(R.drawable.blue_bg));
//        items.add(new CarouselItem(R.drawable.green_bg));
//        items.add(new CarouselItem(R.drawable.purple_bg));

        // Set up the adapter
//        CarouselAdapter adapter = new CarouselAdapter(items, this);
//        viewPager.setAdapter(adapter);
    }
    public void signup(View view) {
        Intent intent = new Intent(MainActivity.this, MainPage.class);
        startActivity(intent);
    }
}