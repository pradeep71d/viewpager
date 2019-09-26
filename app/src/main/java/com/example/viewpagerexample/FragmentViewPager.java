package com.example.viewpagerexample;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentViewPager extends Fragment {


    public FragmentViewPager() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_fragment_view_pager, container, false);
        View v = inflater.inflate(R.layout.fragment_fragment_view_pager, container, false);
        TextView tv = v.findViewById(R.id.title);
        tv.setText(getArguments().getString("text"));
        ImageView imageView = v.findViewById(R.id.image);
        imageView.setBackgroundResource(getArguments().getInt("img"));
        return v;
    }

    public static FragmentViewPager newInstance(String text, int image) {
        FragmentViewPager f=new FragmentViewPager();
        Bundle b=new Bundle();
        b.putString("text",text);
        b.putInt("img",image);
        f.setArguments(b);
        return f;
    }
}
