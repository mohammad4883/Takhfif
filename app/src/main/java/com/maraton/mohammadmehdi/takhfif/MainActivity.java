package com.maraton.mohammadmehdi.takhfif;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    Typeface font;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.constrainLayout,new HomeFragment()).commit();
                    return true;
                case R.id.navigation_add_friend:
                    transaction.replace(R.id.constrainLayout,new Add_FriendFragment()).commit();
                    // mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_transferـmoney:
                    transaction.replace(R.id.constrainLayout,new transfer_moneyFragment()).commit();
                    return true;
                case R.id.navigation_user:
                    transaction.replace(R.id.constrainLayout,new UserFragment()).commit();
                    return true;
                case R.id.navigation_chat:
                    transaction.replace(R.id.constrainLayout,new ChatFragment()).commit();
                    //  mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#512DA8")));*/


       font=Typeface.createFromAsset(getAssets(),"fonts/IRANSansWebFaNum.ttf");



        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.constrainLayout,new HomeFragment()).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
