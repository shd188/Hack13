package com.aimer.shd188.hack13;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textView= (TextView) findViewById(R.id.textView);
        System.out.println("width==" + textView.getWidth()+"height=="+textView.getHeight());
        textView.post(new Runnable() {
            @Override
            public void run() {
                System.out.println("post-width=="+textView.getWidth()+"post-height=="+textView.getHeight());
            }
        });
    }


}
