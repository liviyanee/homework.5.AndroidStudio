package com.example.homework5androidstudio;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
   private List <HowToDrawAHand>list = new ArrayList<>();

    public ViewPagerAdapter(List<HowToDrawAHand> list, FragmentManager fm){
        super(fm);
        this.list = list;
    }

    @Override
    public fragment1 getItem(int position) {
        switch (position) {
            case 0;
            case 1;
            case 2;
                return fragment1.newInstance(list.get(position).getItem(),
                        list.get(position).getDescription(),
                        list.get(position).getImage());
        }
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}

