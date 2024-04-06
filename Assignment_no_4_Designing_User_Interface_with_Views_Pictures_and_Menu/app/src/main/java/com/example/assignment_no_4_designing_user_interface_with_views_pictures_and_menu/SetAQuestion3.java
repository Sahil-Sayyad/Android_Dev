package com.example.assignment_no_4_designing_user_interface_with_views_pictures_and_menu;

/*
* SET A
*      3.Create application to demonstrate date and time picker.
* */
import android.os.Bundle;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar;
import androidx.appcompat.app.AppCompatActivity;


public class SetAQuestion3 extends AppCompatActivity {

    private TextView dateTextView , timeTextView;
    private Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_a_question_3);
        dateTextView = findViewById(R.id.dateTextView);
        timeTextView = findViewById(R.id.timeTextView);
        Button dateButton = findViewById(R.id.datebtn);
        Button timeButton = findViewById(R.id.timebtn);
        calendar = Calendar.getInstance();

        dateButton.setOnClickListener(v -> showDatePicker());
        timeButton.setOnClickListener(v -> showTimePicker());

    }

    private void showDatePicker(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                (view, year, month, dayOfMonth) -> {
                    calendar.set(Calendar.YEAR,year);
                    calendar.set(Calendar.MONTH,month);
                    calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                    updateDateLabel();
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
                );
        datePickerDialog.show();
    }

    private void showTimePicker(){
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                (view, hourOfDay, minute) -> {
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                    calendar.set(Calendar.MINUTE, minute);
                    updateTimeLabel();
                },
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                true
        );
        timePickerDialog.show();
    }
    private void updateDateLabel() {
        String format = "MM/dd/yyyy";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format, java.util.Locale.US);
        dateTextView.setText(sdf.format(calendar.getTime()));
    }

    private void updateTimeLabel() {
        String format = "hh:mm a";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format, java.util.Locale.US);
        timeTextView.setText(sdf.format(calendar.getTime()));
    }
}