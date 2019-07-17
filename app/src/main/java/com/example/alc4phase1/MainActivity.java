package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.example.alc4phase1.About_ALC;
import com.example.alc4phase1.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnaboutalc = (Button) findViewById(R.id.btnaboutalc);
        Button btnmyprofile = (Button) findViewById(R.id.btnmyprofile);

        btnaboutalc.setOnClickListener(this);
        btnmyprofile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnaboutalc:
                startActivity(new Intent(MainActivity.this, About_ALC.class));
                break;
            case R.id.btnmyprofile:
                startActivity(new Intent (MainActivity.this, My_Profile.class));
        }
    }
}
