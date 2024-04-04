package com.example.assignment_no_3_android_user_interface;

/* SET A
*       3.Create the simple calculator shown below also perform appropriate operation.
* */
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class SetAQuestion3 extends AppCompatActivity{

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
    Button add,multi,sub,div,isEqual;
    float m1 , m2;

    boolean addition , subtract, division, multiplication;
    EditText textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_a_question_3);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        isEqual = findViewById(R.id.isEqual);
        textView = findViewById(R.id.edit_text);
        btn1.setOnClickListener(v -> textView.setText(textView.getText() + "1"));
        btn2.setOnClickListener(v -> textView.setText(textView.getText() + "2"));
        btn3.setOnClickListener(v -> textView.setText(textView.getText() + "3"));
        btn4.setOnClickListener(v -> textView.setText(textView.getText() + "4"));
        btn5.setOnClickListener(v -> textView.setText(textView.getText() + "5"));
        btn6.setOnClickListener(v -> textView.setText(textView.getText() + "6"));
        btn7.setOnClickListener(v -> textView.setText(textView.getText() + "7"));
        btn8.setOnClickListener(v -> textView.setText(textView.getText() + "8"));
        btn9.setOnClickListener(v -> textView.setText(textView.getText() + "9"));
        btn11.setOnClickListener(v -> textView.setText(textView.getText() + "0"));
        add.setOnClickListener(v -> {
            if(textView== null){
              textView.setText("");
            }else{
                m1  = Float.parseFloat(textView.getText() + "");
                addition =  true;
                textView.setText(null);
            }

        });
        sub.setOnClickListener(v -> {
            m1 = Float.parseFloat(textView.getText()+ "");
            subtract = true;
            textView.setText(null);
        });
        multi.setOnClickListener(v -> {
            m1 = Float.parseFloat(textView.getText()+ "");
            multiplication = true;
            textView.setText(null);
        });
        div.setOnClickListener(v -> {
            m1 = Float.parseFloat(textView.getText()+ "");
            division = true;
            textView.setText(null);
        });
        isEqual.setOnClickListener(v -> {
            m2 = Float.parseFloat(textView.getText()+ "");
            if(addition){
                textView.setText(m1+m2+"");
                addition= false;
            }
            if(subtract){
                textView.setText(m1-m2+"");
                subtract= false;
            }
            if(division){
                textView.setText(m1/m2+"");
                division= false;
            }
            if(multiplication){
                textView.setText(m1*m2+"");
                multiplication= false;
            }
        });
        btn12.setOnClickListener(v -> textView.setText(""));
        btn10.setOnClickListener(v -> textView.setText(textView.getText() + "."));
    }
}
