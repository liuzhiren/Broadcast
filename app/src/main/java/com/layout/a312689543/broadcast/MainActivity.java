package com.layout.a312689543.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity{
    private Button sendbroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendbroadcast=(Button)findViewById(R.id.SendBoradcast_btn);
        sendbroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.layout.a312689543.broadcast.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }
}
