package com.example.viewpagerexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.pager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(@NonNull FragmentManager fm) {

            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FragmentViewPager.newInstance(getString(R.string.app_name), R.drawable.man1);

                case 1:
                    return FragmentViewPager.newInstance(getString(R.string.app_name), R.drawable.boy1);
                case 2:
                    return FragmentViewPager.newInstance(getString(R.string.app_name), R.drawable.female1);
                default:
                    return FragmentViewPager.newInstance(getString(R.string.app_name), R.drawable.man1);
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
