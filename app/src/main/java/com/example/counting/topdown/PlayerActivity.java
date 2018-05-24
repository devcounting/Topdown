package com.example.counting.topdown;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PlayerActivity extends AppCompatActivity {

    /** PLAYER ACTIVITY INSTANCE VARIABLES **/
    // ANDROID WIDGETS
    private ViewPager       mPager;
    private PagerAdapter    mPagerAdapter;

    // IMPORTANT INSTANCE VARIABLES



    private void setup() {
        mPager = (VerticalViewPager) findViewById(R.id.viewpager);
        mPagerAdapter = new TopDownAdapter(getSupportFragmentManager());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        setup();
    }

    // to fix
    private class TopDownAdapter extends FragmentPagerAdapter {

        public TopDownAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
    }
}
