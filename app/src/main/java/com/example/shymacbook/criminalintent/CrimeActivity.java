package com.example.shymacbook.criminalintent;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class CrimeActivity extends SingleFragmentActivity {

    // OLDER METHOD - before we made abstract class of SingleFragmentActivity
    // pp.164
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//
//        if ( fragment == null ){
//            fragment = new CrimeFragment();
//            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
//        }
//    }

    // NEW METHOD - pp.164


    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
