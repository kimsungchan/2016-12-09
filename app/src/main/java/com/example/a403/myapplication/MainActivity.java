package com.example.a403.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    Switch s;
    Chronometer c;
    RadioGroup rg;
    RadioButton r1,r2,r3;
    ImageView image;
    EditText e1,e2,e3;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s = (Switch)findViewById(R.id.switch2);
        l = (LinearLayout)findViewById(R.id.linearout);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        c = (Chronometer)findViewById(R.id.chronometer3);
        rg = (RadioGroup)findViewById(R.id.radioGroup);
        r1 = (RadioButton)findViewById(R.id.radioButton4);
        r2 = (RadioButton)findViewById(R.id.radioButton5);
        r3 = (RadioButton)findViewById(R.id.radioButton6);
        image = (ImageView)findViewById(R.id.imageView2);
        e1 = (EditText)findViewById(R.id.editText7);
        e2 = (EditText)findViewById(R.id.editText8);
        e3 = (EditText)findViewById(R.id.editText9);

         s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(s.isChecked()){
                     l.setVisibility(View.VISIBLE);
                     c.start();
                     c.setTextColor(Color.BLUE);
                 }
                 else {
                     l.setVisibility(View.INVISIBLE);
                     c.stop();
                 }
             }
         });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checckId){
                if(r1.isChecked()){

                }
            }
        });

    }
}
