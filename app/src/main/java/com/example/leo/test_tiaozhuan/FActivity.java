package com.example.leo.test_tiaozhuan;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FActivity extends AppCompatActivity {
    private Button bt1;
    private Button btse;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        bt1 =(Button)findViewById(R.id.button2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(FActivity.this,SActivity.class);
                startActivity(intent);
            }
        });

        btse = (Button)findViewById(R.id.button_second);
        btse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FActivity.this,SActivity.class);
                startActivityForResult(intent,1);
            }
        });

        tv = (TextView)findViewById(R.id.textView);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 1 && resultCode == 2){
            String content = data.getStringExtra("data");
            tv.setText(content);
        }
    }

}
