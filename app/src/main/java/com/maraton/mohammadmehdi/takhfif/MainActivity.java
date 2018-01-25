package com.maraton.mohammadmehdi.takhfif;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Intent i;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
             //       i=new Intent(getApplicationContext(),)
                    //  mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_add_friend:

                    // mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_transferـmoney:


                case R.id.navigation_user:


                case R.id.navigation_chat:
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
    }
}
