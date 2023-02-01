package com.improve10x.practiceandroid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toolbar;
import android.widget.ViewSwitcher;

import com.improve10x.practiceandroid.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity {

    private ActivityImageSwitcherBinding binding;
    int imageSwitcherImages[] = {R.drawable.pspk_2, R.drawable.ram_charan_1};
    int switcherImageLength = imageSwitcherImages.length;
    int counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Image Switcher");
        ImageSwitcher imageSwitcher = (ImageSwitcher) findViewById(R.id.image_switcher_img);
        Button nextButton = (Button) findViewById(R.id.next_btn);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView switcherImageView = new ImageView(getApplicationContext());
                switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                switcherImageView.setImageResource(R.drawable.pspk_2);
                return switcherImageView;
            }
        });

        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

        imageSwitcher.setOutAnimation(aniOut);
        imageSwitcher.setInAnimation(aniIn);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                if (counter == switcherImageLength) {
                    counter = 0;
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                } else {
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }
            }
        });
    }
}