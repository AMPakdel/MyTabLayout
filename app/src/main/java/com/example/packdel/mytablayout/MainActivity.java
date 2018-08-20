package com.example.packdel.mytablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public PageViewerAdapter pageViewerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pageViewerAdapter = new PageViewerAdapter(getSupportFragmentManager());
        pageViewerAdapter.addFragment(new QuizFragment(), "Quiz");
        pageViewerAdapter.addFragment(new StoreFragment(), "Store");
        pageViewerAdapter.addFragment(new ExploreFragment(), "Explore");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        viewPager.setAdapter(pageViewerAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
