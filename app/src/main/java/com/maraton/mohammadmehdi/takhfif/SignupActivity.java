package com.maraton.mohammadmehdi.takhfif;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    Button btn_signIn;
    Typeface font;
    Button btn_signUp;
    TextView tv_welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        tv_welcome=findViewById(R.id.welcome);
        font= Typeface.createFromAsset(getAssets(),"fonts/IRANSansWebFaNum.ttf");
        tv_welcome.setTypeface(font);
        setTitle("Sign Up");

        btn_signUp=findViewById(R.id.btn_signup);
        btn_signIn=findViewById(R.id.btn_signin);

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        btn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SignInActivity.class);
                startActivity(i);
            }
        });
    }
}
