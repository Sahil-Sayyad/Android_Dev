package com.example.assignment_no2_activites_fragments_intents;


import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
public class SetAQuestion2B extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_a_question_2b);

        TextView messageTextView = findViewById(R.id.text_message);

        Intent intent = getIntent();

        if(intent != null && intent.hasExtra("message")){
            String message = intent.getStringExtra("message");
            messageTextView.setText(message);
        }else{
            messageTextView.setText("No Message received");
        }

    }
}
