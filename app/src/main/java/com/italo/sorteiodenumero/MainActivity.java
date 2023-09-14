package com.italo.sorteiodenumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlayTapped(View view) {
        int newNumber = new Random().nextInt(11);

        TextView resultTextView = findViewById(R.id.resultText);
        String resultText = "O número sorteado foi: " + newNumber;
        resultTextView.setText(resultText);
    }
}