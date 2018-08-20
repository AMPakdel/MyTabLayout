package com.example.packdel.mytablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Packdel on pic3/16/2018.
 */

public class PageViewerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentsList = new ArrayList<>();

    private List<String> fragmentsListTitle = new ArrayList<>();

    public PageViewerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {

        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {

        return fragmentsList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentsListTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title){

        fragmentsList.add(fragment);

        fragmentsListTitle.add(title);
    }
}
