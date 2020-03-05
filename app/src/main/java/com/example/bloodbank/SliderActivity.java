package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bloodbank.Adapters.SliderAdapter;

public class SliderActivity extends AppCompatActivity {
    private Button btnNext;
    ViewPager viewPager;
    int[] layouts;


    SliderAdapter sliderAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        viewPager=findViewById(R.id.slider_view_pager);
        btnNext=findViewById(R.id.slider_next_btn);
        layouts=new int[]{R.layout.slider1,
                R.layout.slider2,
                R.layout.slider3};


        sliderAdapter=new SliderAdapter(this,layouts);
        viewPager.setAdapter(sliderAdapter);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem()+1<layouts.length)
                {
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                }
                else
                {
                    Intent intent = new Intent(SliderActivity.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        });


    }
}
