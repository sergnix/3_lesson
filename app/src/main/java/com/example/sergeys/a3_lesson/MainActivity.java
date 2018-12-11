package com.example.sergeys.a3_lesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.Login);
        et2 = (EditText) findViewById(R.id.Password);
        tv = (TextView) findViewById(R.id.Textview);

        btnSend = (Button) findViewById(R.id.Send);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "login" + et1.getText().toString() + "\n";
                result += "password" + Objects.hashCode(et2.getText().toString()) + "\n";
                tv.setText(result + tv.getText().toString());
            }
        };

        btnSend.setOnClickListener(listener);

    }

    public void getMessage(View v) {
        System.out.println("Pressed");
    }

    public void clear(View v) {
        tv.setText("");
        et1.setText("");
        et2.setText("");
    }
}
