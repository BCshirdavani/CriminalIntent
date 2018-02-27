package com.example.shymacbook.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shymacbook on 2/26/18.
 */


public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

//public class CrimeListActivity extends SingleFragmentActivity {
//    @Override
//    protected Fragment createFragment() {
//        return new CrimeListFragment();
//    }
//}
