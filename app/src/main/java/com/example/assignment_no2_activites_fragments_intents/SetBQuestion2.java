package com.example.assignment_no2_activites_fragments_intents;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class SetBQuestion2 extends AppCompatActivity{
    private EditText editTextFirstName, editTextMiddleName, editTextLastName,editTextDOB,editTextAddress,editTextEmail;
   Button buttonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_b_question_2);

        editTextFirstName = findViewById(R.id.editTextFirstname);
        editTextMiddleName = findViewById(R.id.editTextMiddlename);
        editTextLastName = findViewById(R.id.editTextLastname);
        editTextDOB = findViewById(R.id.editTextDate);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                submitInfo();
            }
        });


    }
    private void submitInfo(){
        String firstname = editTextFirstName.getText().toString();
        String middlename = editTextMiddleName.getText().toString();
        String lastname = editTextLastName.getText().toString();
        String dob = editTextDOB.getText().toString();
        String address = editTextAddress.getText().toString();
        String email = editTextEmail.getText().toString();

        Intent intent = new Intent(this,SetBQuestion2B.class);
        intent.putExtra("firstname", firstname);
        intent.putExtra("middlename", middlename);
        intent.putExtra("lastname", lastname);
        intent.putExtra("dob", dob);
        intent.putExtra("address", address);
        intent.putExtra("email", email);

        startActivity(intent);

    }

}
