package com.example.homework5androidstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.view_pager);
        View txtSkip = findViewById(R.id.txt_skip);
        View txtNext = findViewById(R.id.txt_next);
        List<HowToDrawAHand> list = new ArrayList<>();
        list.add(new HowToDrawAHand("Hello everyone 1", "Let's draw a hand", R.drawable.picture1));
        list.add(new HowToDrawAHand("Hello everyone 2", "Let's draw a hand", R.drawable.picture1));
        list.add(new HowToDrawAHand("Hello everyone 3", "Let's draw a hand", R.drawable.picture1));
        adapter = new ViewPagerAdapter(list, getSupportFragmentManager());
        pager.setAdapter(adapter);

        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 2){
                    txtNext.setText("Finish");
                } else txtNext.setText("Next");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

         txtNext.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (pager.getCurrentItem() == 2) {
                     Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                     startActivity(intent);
                 } else {
                     pager.setCurrentItem(pager.getCurrentItem() + 1);
                 }
             }

         });}}


