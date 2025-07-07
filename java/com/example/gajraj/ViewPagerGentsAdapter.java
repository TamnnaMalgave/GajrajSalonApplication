package com.example.gajraj;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerGentsAdapter  extends FragmentPagerAdapter {
    public ViewPagerGentsAdapter(@NonNull FragmentManager fm) {
        super(fm);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Fragment1();
        } else
        {

            return new Fragment2();
        }
    }

    @Override
    public int getCount() {
        return 2;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "gents";
        }
        else {
            return "ladies";
        }
    }
}

