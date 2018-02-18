package com.abhinav.mostwantedprom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rule4Activity extends AppCompatActivity {
    Button proceed, back;
    static Rule4Activity INSTANCE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule4);
        INSTANCE=this;
        proceed =(Button) findViewById(R.id.proceed);
        back = (Button) findViewById(R.id.back);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rule4Activity.this,GenderActivity.class));
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
    public Rule4Activity getActivityInstance(){return INSTANCE;}
    public boolean hasReaded(){
        return true;
    }
}
