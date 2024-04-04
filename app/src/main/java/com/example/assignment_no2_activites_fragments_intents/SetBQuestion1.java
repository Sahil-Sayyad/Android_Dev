package com.example.assignment_no2_activites_fragments_intents;

/* SET B
*       1.Create simple application with login screen. On successful login, gives message go to next
*         Activity(Without using database).
* */
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class SetBQuestion1 extends AppCompatActivity{

    private static final String USERNAME="user";
    private static final String PASSWORD="password";
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_b_question_1);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                 login();
            }
        });

    }

    private void login(){
        String username= editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();
        System.out.println(username);

        if(username.equals(USERNAME) && password.equals(PASSWORD)){
            Intent intent = new Intent(this,SetBQuestion1B.class);
            startActivity(intent);
            finish();
            Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Invalid username or password",Toast.LENGTH_SHORT).show();
        }
    }
}
