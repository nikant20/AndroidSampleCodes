package com.wordpress.nikant20.imagesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivImage;
    TextView tvImageOne,tvImageTwo,tvImageThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImage = (ImageView) findViewById(R.id.ivImage);

        tvImageOne = (TextView) findViewById(R.id.tvImageOne);
        tvImageThree = (TextView) findViewById(R.id.tvImageThree);
        tvImageTwo = (TextView) findViewById(R.id.tvImageTwo);


        tvImageOne.setOnClickListener(this);
        tvImageTwo.setOnClickListener(this);
        tvImageThree.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.tvImageOne:

                ivImage.setImageResource(R.drawable.image_one);
                break;
            case R.id.tvImageTwo:

                ivImage.setImageResource(R.drawable.image_two);

                break;
            case R.id.tvImageThree:

                ivImage.setImageResource(R.drawable.image_three);

                break;


        }
    }
}
