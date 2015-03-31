package com.example.darkwawe.sendsms.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.darkwawe.sendsms.R;

/**
 * Created by darkwawe on 31.03.2015.
 */
public class LanguageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

    }

    public void ReturnResultLanguage(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnChooseRus:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("lang", "russian");
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btnChooseEng:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("lang", "english");
                setResult(RESULT_OK, intent);
                finish();
                break;

        }
    }

}
