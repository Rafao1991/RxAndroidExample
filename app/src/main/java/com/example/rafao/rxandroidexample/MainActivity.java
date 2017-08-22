package com.example.rafao.rxandroidexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jakewharton.rxbinding2.view.RxView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RxView.clicks(findViewById(R.id.button_do_it))
                .subscribe(aVoid -> Toast.makeText(this, "Bang!", Toast.LENGTH_LONG).show());
    }
}
