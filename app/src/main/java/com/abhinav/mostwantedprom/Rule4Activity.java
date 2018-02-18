package com.abhinav.mostwantedprom;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rule4Activity extends AppCompatActivity {
    Button proceed, back;
    public static String globalPreferenceName="ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule4);
        proceed =(Button) findViewById(R.id.proceed);
        back = (Button) findViewById(R.id.back);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rule4Activity.this,GenderActivity.class));
                SharedPreferences skip = getSharedPreferences(globalPreferenceName,MODE_PRIVATE);
                SharedPreferences.Editor editor = skip.edit();
                editor.putBoolean("ACTIVITY",true);
                editor.commit();
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rule4Activity.this,Rule3Activity.class));
                finish();
            }
        });
    }

}
