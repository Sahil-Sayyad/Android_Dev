package com.example.assignment_no_4_designing_user_interface_with_views_pictures_and_menu;

import android.os.Bundle;
import android.widget.ToggleButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class SetAQuestion4 extends AppCompatActivity {
    ImageView lightBulbImage;
    ToggleButton toggleButton;
    boolean isBulbOn = false;
    @Override
    protected  void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_a_question_4);

        lightBulbImage = findViewById(R.id.lightBulbImage);
        toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            isBulbOn = isChecked;
            if(isBulbOn){
                lightBulbImage.setImageResource(R.drawable.ic_launcher_background);
            }else{
                lightBulbImage.setImageResource(R.drawable.ic_launcher_foreground);
            }
        }));
    }
}
