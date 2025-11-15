package com.example.fragmentandviewpaper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.fragmentandviewpaper.fragment.Frag1;
import com.example.fragmentandviewpaper.fragment.Frag2;
import com.example.fragmentandviewpaper.fragment.Frag3;
import com.example.fragmentandviewpaper.fragment.Frag4;

public class MyPagerAdapter extends FragmentStateAdapter {

    public MyPagerAdapter(@NonNull FragmentActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new Frag1();
            case 1: return new Frag2();
            case 2: return new Frag3();
            default: return new Frag4();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
