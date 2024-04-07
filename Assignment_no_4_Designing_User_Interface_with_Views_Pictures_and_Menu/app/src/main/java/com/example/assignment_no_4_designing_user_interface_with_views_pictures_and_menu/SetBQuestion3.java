package com.example.assignment_no_4_designing_user_interface_with_views_pictures_and_menu;

/*
* SET B
*     3.Construct images switcher using setFactory().
* */
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class SetBQuestion3 extends  AppCompatActivity{
     ImageSwitcher imageSwitcher;
     Button buttonNext;

     int imageList[] = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
     int currentIndex = -1;
     @Override
     protected  void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         setContentView(R.layout.set_b_question_3);

         imageSwitcher = findViewById(R.id.imageSwitcher);
         buttonNext = findViewById(R.id.buttonNext);

         Animation inAnimation  = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
         Animation outAnimation  = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

         imageSwitcher.setInAnimation(inAnimation);
         imageSwitcher.setOutAnimation(outAnimation);

         imageSwitcher.setFactory(() ->{
             ImageView imageView = new ImageView(getApplicationContext());
             imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
             return imageView;
         });

         buttonNext.setOnClickListener(view ->{
             currentIndex++;
             if(currentIndex == imageList.length){
                 currentIndex=0;
             }
             imageSwitcher.setImageResource(imageList[currentIndex]);
         });
     }
}
