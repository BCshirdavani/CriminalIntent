package com.example.shymacbook.criminalintent;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;


import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}




//public class CrimeActivity extends SingleFragmentActivity {
//
//    // NEW METHOD - pp.164
//    @Override
//    protected Fragment createFragment() {
//        return new CrimeFragment();
//    }
//}
