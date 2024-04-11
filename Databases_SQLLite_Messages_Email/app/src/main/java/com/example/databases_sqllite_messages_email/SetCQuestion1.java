package com.example.databases_sqllite_messages_email;

/*
* SET C
*      1.Create simple application shown below.Create table Student(Sid,Sname,phnoe).
*        Use autoincrement for Sid and Perform Following operation.
*         a.Add Student and display its information,
*         b.Delete Student.
* */
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class SetCQuestion1 extends AppCompatActivity{

    EditText editTextName, editTextPhone, editTextId;
    TextView textViewStudentInfo;
    Button addButton, deleteButton;
    DatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_c_question_1);

        dbHelper = new DatabaseHelper(this);

        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextId = findViewById(R.id.editTextId);
        addButton = findViewById(R.id.addButton);
        deleteButton = findViewById(R.id.deleteButton);
        textViewStudentInfo = findViewById(R.id.textViewStudentInfo);

        addButton.setOnClickListener(v-> addStudent());
        deleteButton.setOnClickListener(v-> deleteStudent(Integer.parseInt(String.valueOf(editTextId.getText()))));

    }

    private void addStudent(){
        String name = editTextName.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();

        if(name.isEmpty() || phone.isEmpty()){
            Toast.makeText(this,"Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        SQLiteDatabase db  = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("Sname",name);
        values.put("phno",phone);

        long newRowId = db.insert("Student",null,values);
        if(newRowId != -1){
            Toast.makeText(this,"Student added Succefully with ID:"+ newRowId,Toast.LENGTH_SHORT).show();
            displayStudentDetails(newRowId);
        }else{
            Toast.makeText(this,"Error adding student",Toast.LENGTH_SHORT).show();

        }
    }

    private void displayStudentDetails(long studentId){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor= db.query("Student", null,"Sid=?",new String[]{String.valueOf(studentId)},null,null,null);
        if(cursor.moveToFirst()){
            @SuppressLint("Range") String info = "ID: "+cursor.getLong(cursor.getColumnIndex("Sid")) + "\n" +
                    "Name : " + cursor.getString(cursor.getColumnIndex("Sname")) + "\n"+
                   "Phone: " + cursor.getString(cursor.getColumnIndex("phno"));
            System.out.println(info);
            textViewStudentInfo.setText(info);
        }
       cursor.close();
    }

    private void deleteStudent(long studentId) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        int deletedRows = db.delete("Student", "Sid=?", new String[]{String.valueOf(studentId)});
        if (deletedRows > 0) {
            Toast.makeText(this, "Student deleted successfully", Toast.LENGTH_SHORT).show();
            textViewStudentInfo.setText("");
        } else {
            Toast.makeText(this, "Error deleting student", Toast.LENGTH_SHORT).show();
        }
    }
}
