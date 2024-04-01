/*
* Assignment No.2 Activites, Fragments and Intents.
*
* */
package com.example.helloworld;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    TextView lifeCycleTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lifeCycleTextView = findViewById(R.id.text_lifecyle);

        updateLifeCycleText("onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        updateLifeCycleText("onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        updateLifeCycleText("onResume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        updateLifeCycleText("onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        updateLifeCycleText("onDestroy");
    }

    private void updateLifeCycleText(String message){
        String currentText = lifeCycleTextView.getText().toString();

        currentText += "\n " + message + "By Sahil Sayyad";

        lifeCycleTextView.setText(currentText);
    }
}