package com.example.leo.test_tiaozhuan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SActivity extends AppCompatActivity {
    private Button bt_fanhui;
    private Button bt_er;
    private String content = "Hello World";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

        bt_fanhui = (Button) findViewById(R.id.button1);
        bt_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SActivity.this,FActivity.class);
                startActivity(intent1);
            }
        });

        bt_er = (Button)findViewById(R.id.button3);
        bt_er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra(content,"data");
                setResult(2,data);

                finish();
            }
        });
    }

}
