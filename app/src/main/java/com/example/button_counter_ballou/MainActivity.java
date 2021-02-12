package com.example.button_counter_ballou;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button incrementorB;
private Button decrementorB;
private Button resetB;
private TextView text;
private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementorB = (Button) this.findViewById(R.id.incrementorB);
        decrementorB = (Button) this.findViewById(R.id.decrementorB);
        resetB = (Button) this.findViewById(R.id.resetB);
        count = 0;
        incrementorB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count += 1;
                text.setText(String.valueOf(count));
            }
        });
        decrementorB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count -= 1;
                text.setText(String.valueOf(count));
            }
        });
        resetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                text.setText(String.valueOf(count));
            }
        });
        text = (TextView) this.findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {

    }

}