package com.example.bloodbank.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.zip.Inflater;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    int[] layouts;
    LayoutInflater layoutInflater;


    public SliderAdapter(Context context,int[] layouts){
        this.layouts=layouts;
        this.layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }





    //create the page for the given postion,
    // The adapter is responsible for adding the view to the container given here.
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(layouts[position],container,false);
        container.addView(view);
        return view;
    }



    @Override
    public int getCount() {
        return layouts.length;
    }


    //Remove a page for the given position.
    // The adapter is responsible for removing the view from its container
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }




    //Remove a page for the given position.
    // The adapter is responsible for removing the view from its container
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View)object);
    }
}
