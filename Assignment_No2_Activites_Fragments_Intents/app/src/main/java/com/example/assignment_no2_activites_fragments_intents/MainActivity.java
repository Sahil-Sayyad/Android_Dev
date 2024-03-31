package com.example.assignment_no2_activites_fragments_intents;

/* SET-A
       1. Create a simple application which shows life cycle of activity.
*/

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private TextView lifecyleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecyleTextView = findViewById(R.id.text_lifeCyle);
        updatesLifestyleText("onCreate by Sahil Sayyad");

    }
    @Override
    protected void onStart(){
        super.onStart();
        updatesLifestyleText("onStart by Ragnar");
    }
    @Override
    protected void onResume(){
        super.onResume();
        updatesLifestyleText("onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        updatesLifestyleText("onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        updatesLifestyleText("onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        updatesLifestyleText("onDestroy");
    }
    private void updatesLifestyleText(String message){
        String currentText = lifecyleTextView.getText().toString();
        currentText += "\n" + message;
        lifecyleTextView.setText(currentText);
    }
}