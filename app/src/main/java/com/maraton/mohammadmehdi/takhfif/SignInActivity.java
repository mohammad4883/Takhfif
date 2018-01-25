package com.maraton.mohammadmehdi.takhfif;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    Typeface font;
    Button btn_signIn;
    Button btn_signUp;
    TextView tv_welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        tv_welcome=findViewById(R.id.welcome);
        setTitle("Sign in");
        font=Typeface.createFromAsset(getAssets(),"fonts/IRANSansWebFaNum.ttf");
        btn_signUp=findViewById(R.id.btn_signup);
        btn_signIn=findViewById(R.id.btn_login);

        tv_welcome.setTypeface(font);
        try
        {
            btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(i);
            }
        });
            btn_signIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
            });
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),e.getMessage().toString(),Toast.LENGTH_LONG).show();
        }






    }
}
