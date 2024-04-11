package com.example.databases_sqllite_messages_email;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME ="StudentDB";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String createTableQuery = "CREATE TABLE Student("+
                "Sid INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "Sname TEXT,"+
                "phno TEXT)";
        db.execSQL(createTableQuery);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS Student");
        onCreate(db);
    }
}
