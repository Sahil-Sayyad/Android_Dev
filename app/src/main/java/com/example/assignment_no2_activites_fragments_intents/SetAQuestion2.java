package com.example.assignment_no2_activites_fragments_intents;
/*
  SET-A
       2.Create a simple application which send hello message from one activity to another
         with help of Button(Use intent).
 */

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
public class SetAQuestion2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_a_question_2);

        Button sendButton = findViewById(R.id.button_send);

        sendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sendMessage();
            }
        });

    }
    private void sendMessage(){
        Intent intent = new Intent(this,SetAQuestion2B.class);
        intent.putExtra("message", "Hello Sahil");
        startActivity(intent);
    }
}
