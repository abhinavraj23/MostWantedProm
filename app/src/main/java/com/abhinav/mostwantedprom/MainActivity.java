package com.abhinav.mostwantedprom;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button proceed;
     boolean hasRead = false;
    public static String globalPreferenceName="ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences skip = getSharedPreferences(globalPreferenceName,MODE_PRIVATE);
        hasRead = skip.getBoolean("ACTIVITY",hasRead);
        if(!hasRead) {
            proceed = (Button) findViewById(R.id.button);
            proceed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, Rule1Activity.class));
                    finish();
                }
            });
        }
        else{
            startActivity(new Intent(MainActivity.this, GenderActivity.class));
            finish();
        }
    }
}
