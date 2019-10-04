package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    boolean twentyfourhr = false;
    String ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // true is 24h clock, false is 12h



        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyfourhr = false;
                String time1 = showTime("Sydney: ", 0, twentyfourhr);
                TextView TextView1 = findViewById(R.id.time);
                TextView1.setText(time1);

                String time2 = showTime("New York: ", -14, twentyfourhr);
                TextView TextView2 = findViewById(R.id.nyTime);
                TextView2.setText(time2);

                String time3 = showTime("Tokyo: ", -1, twentyfourhr);
                TextView TextView3 = findViewById(R.id.tokyoTime);
                TextView3.setText(time3);

                String time4 = showTime("Rome: ", -8, twentyfourhr);
                TextView TextView4 = findViewById(R.id.romeTime);
                TextView4.setText(time4);

                String time5 = showTime("Vancouver: ", -17, twentyfourhr);
                TextView TextView5 = findViewById(R.id.vancouverTime);
                TextView5.setText(time5);
            }

        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyfourhr = true;
                String time1 = showTime("Sydney: ", 0, twentyfourhr);
                TextView TextView1 = findViewById(R.id.time);
                TextView1.setText(time1);

                String time2 = showTime("New York: ", -14, twentyfourhr);
                TextView TextView2 = findViewById(R.id.nyTime);
                TextView2.setText(time2);

                String time3 = showTime("Tokyo: ", -1, twentyfourhr);
                TextView TextView3 = findViewById(R.id.tokyoTime);
                TextView3.setText(time3);

                String time4 = showTime("Rome: ", -8, twentyfourhr);
                TextView TextView4 = findViewById(R.id.romeTime);
                TextView4.setText(time4);

                String time5 = showTime("Vancouver: ", -17, twentyfourhr);
                TextView TextView5 = findViewById(R.id.vancouverTime);
                TextView5.setText(time5);
            }

        });
    }

    String showTime(String locationName, int add, boolean twentyfour) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR,add);
        SimpleDateFormat localformat;

        if (twentyfour) {
             localformat = new SimpleDateFormat("HH:mm");
        }
        else {
            localformat = new SimpleDateFormat("hh:mm aaa");
        }

        String CurrentTime = localformat.format(calendar.getTime());
        String locationTime = locationName + CurrentTime;
        return locationTime;
    }
}
