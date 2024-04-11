package com.example.databases_sqllite_messages_email;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class SetAQuestion5 extends  AppCompatActivity{

    EditText editTextTo,editTextSubject,editTextMessage;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_a_question_5);

        editTextTo = findViewById(R.id.editTextTo);
        editTextSubject = findViewById(R.id.editTextSubject);
        editTextMessage = findViewById(R.id.editTextMessage);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(v-> sendEmail());

    }
    private void sendEmail(){
        String to = editTextTo.getText().toString().trim();
        String subject = editTextSubject.getText().toString().trim();
        String message = editTextMessage.getText().toString().trim();

        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {to});
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);

        try{
            startActivity(Intent.createChooser(intent,"Send mail...."));

        }catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(this,"There is no email clients installed.", Toast.LENGTH_SHORT).show();
        }

    }
}
