package com.example.android.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hello extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("count");
        setContentView(R.layout.activity_hello);
        text = (TextView) findViewById(R.id.textView);
        text.setText(str);
    }
}
