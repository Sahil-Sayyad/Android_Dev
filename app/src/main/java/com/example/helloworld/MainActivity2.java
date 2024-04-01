package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    String tag ="Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d(tag,"In on Create Event");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(tag,"In the onStart() Event");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(tag,"In the onRestart() event ");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(tag,"In the onResume() event");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(tag,"In the onPause() event");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(tag,"In the onStop() event");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(tag, "In the onDestroy event");
    }
}