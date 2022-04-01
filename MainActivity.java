package com.example.sjcet.qn1androidexternal;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText et1,et2,et3;
TextView textView1,textView3,textView4;
Button button1,button2;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        textView1.setText(sharedPreferences.getString(textView1));
        textView3.setText(sharedPreferences.getString(textView3));
        textView4.setText(sharedPreferences.getString(textView4));
        et1.getText(sharedPreferences.getString(et1));
        et2.getText(sharedPreferences.getString(et2));
        et3.getText(sharedPreferences.getString(et3));

    }
}
