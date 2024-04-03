package com.example.assignment_no2_activites_fragments_intents;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SetBQuestion2B extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_b_question_2b);

        TextView textViewinfo = findViewById(R.id.textViewInfo);

        String firstName = getIntent().getStringExtra("firstname");
        String middleName = getIntent().getStringExtra("middlename");
        String lastName = getIntent().getStringExtra("lastname");
        String dob = getIntent().getStringExtra("dob");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");

        String info = "First Name : " + firstName + "\n" +
                "Middle Name : " + middleName + "\n" +
                "Last Name : " + lastName + "\n" +
                "Date of Birth : " + dob + "\n" +
                "Address : " + address + "\n" +
                "Email : " + email;
        textViewinfo.setText(info);

    }
}
