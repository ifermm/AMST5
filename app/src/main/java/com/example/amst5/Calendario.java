package com.example.amst5;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class Calendario extends AppCompatActivity {
    CalendarView calendarView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        calendarView = (CalendarView) findViewById(R.id.calendar);
        textView = (TextView) findViewById(R.id.textview);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String evento = dayOfMonth+"/"+month+"/"+year+": Entrega de laboratorio 1 de AMST";
                textView.setText(evento);
            }
        });

    }
}