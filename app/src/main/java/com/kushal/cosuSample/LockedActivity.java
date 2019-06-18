package com.kushal.cosuSample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LockedActivity extends CosuActivity {

    Button btn_lock, btn_unlock;
    TextView tv_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        btn_lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCosu();
                tv_status.setText("Locked");
            }
        });

        btn_unlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopCosu();
                tv_status.setText("Unlocked");
            }
        });

    }

    private void initViews() {
        tv_status = findViewById(R.id.tv_status);
        btn_lock = findViewById(R.id.btn_lock);
        btn_unlock = findViewById(R.id.btn_unlock);
    }

    @Override
    public void onBackPressed() {

    }
}
