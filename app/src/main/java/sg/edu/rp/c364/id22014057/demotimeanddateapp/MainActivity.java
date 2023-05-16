package sg.edu.rp.c364.id22014057.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    TimePicker timePicker;
    Button displayDateButton;
    Button displayTimeButton;
    TextView textView;

    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        displayDateButton = findViewById(R.id.btnDisplayDate);
        displayTimeButton = findViewById(R.id.btnDisplayTime);
        textView = findViewById(R.id.textView);
        btnReset=findViewById(R.id.btnreset);


        displayTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = "Time is " + timePicker.getHour() + ":" + timePicker.getMinute();
                textView.setText(time);

            }
        });

        displayDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = "Today is " + datePicker.getDayOfMonth() + "/" + (datePicker.getMonth() + 1) + "/" + datePicker.getYear();
                textView.setText(date);

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePicker.setHour(0);
                timePicker.setMinute(0);
                datePicker.updateDate(2023, 2, 1);
                textView.setText("");
                }
        });
    }
}