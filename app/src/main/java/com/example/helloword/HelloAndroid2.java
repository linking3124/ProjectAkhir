package com.example.helloword;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class HelloAndroid2 extends Activity {
    public void onCreate (Bundle SaveIntanceState) {
        super.onCreate(SaveIntanceState);

        ImageView hello = new ImageView(this);
        hello.setImageResource(R.drawable.hellocba);
        setContentView(hello);
    }
}
