package com.example.assignment_no2_activites_fragments_intents;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SetAQuestion3B extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_a_question_3b);

        String selectedItem = getIntent().getStringExtra("selectedItem");
        if(selectedItem != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container,DetailsFragment.newInstance(selectedItem))
                    .commit();
        }
    }
}
