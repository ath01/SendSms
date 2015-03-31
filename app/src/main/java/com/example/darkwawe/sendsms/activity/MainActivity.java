package com.example.darkwawe.sendsms.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.darkwawe.sendsms.R;
import com.example.darkwawe.sendsms.util.RequestCode;


public class MainActivity extends Activity {

    TextView txtLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnChooseLanguage = (Button) findViewById(R.id.btnChooseLanguage);
        btnChooseLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseLanguage(v);
            }
        });
        txtLanguage = (TextView) findViewById(R.id.btnChooseLanguage);
    }

    public void chooseLanguage(View v) {
        Intent i = new Intent(this, LanguageActivity.class);
        startActivityForResult(i, RequestCode.REQUEST_CODE_LANGUAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String language = data.getStringExtra("lang");
        switch (language) {
            case "russian":
                txtLanguage.setText("Русский.");
                break;
            case "english":
                txtLanguage.setText("Английский");
                break;
        }
    }
}