package com.abhinav.mostwantedprom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rule2Activity extends AppCompatActivity {
    Button proceed, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule2);
        proceed =(Button) findViewById(R.id.proceed);
        back = (Button) findViewById(R.id.back);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rule2Activity.this,Rule3Activity.class));
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rule2Activity.this,Rule1Activity.class));
                finish();
            }
        });
    }
}
