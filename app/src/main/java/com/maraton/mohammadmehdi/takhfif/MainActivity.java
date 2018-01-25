package com.maraton.mohammadmehdi.takhfif;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    Intent i;
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
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.constrainLayout,new HomeFragment()).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
