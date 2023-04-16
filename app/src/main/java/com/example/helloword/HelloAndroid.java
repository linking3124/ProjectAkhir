package com.example.helloword;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloAndroid extends Activity {
    public void onCreate (Bundle SaveIntanceState){
        super.onCreate(SaveIntanceState);
        TextView tulisan = new TextView(this);
        tulisan.setText("Program Hello Android...!");
        setContentView(tulisan);
    }
}
