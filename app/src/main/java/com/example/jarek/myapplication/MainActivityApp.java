package com.example.jarek.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityApp extends Activity {

    String person = "";
    Button button1;
    Button button2;
    Button button3;
    Button gotowe;
    AutoCompleteTextView pole1;
    AutoCompleteTextView pole2;

    @Override
    protected void onCreate(Bundle sevadInstanceState) {
        super.onCreate(sevadInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        gotowe = (Button) findViewById(R.id.button4);
        pole1 = (AutoCompleteTextView) findViewById(R.id.pole1);
        pole2 = (AutoCompleteTextView) findViewById(R.id.pole2);

        gotowe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String imie = pole1.getText().toString();
                String nazwisko = pole2.getText().toString();
                person = imie + " " + nazwisko;

                if(person != "") {

                    button1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View vb1) {
                            TextView textView = (TextView) findViewById(R.id.textView);
                            textView.setText(person + ": przycisk1");
                        }
                    });

                    button2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View vb2) {
                            TextView textView = (TextView) findViewById(R.id.textView);
                            textView.setText(person + ": przycisk2");
                        }
                    });

                    button3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View vb3) {
                            TextView textView = (TextView) findViewById(R.id.textView);
                            textView.setText(person + ": przycisk3");
                        }
                    });
                }
            }
        });
    }
}