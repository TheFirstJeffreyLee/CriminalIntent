package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jlee on 10/20/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
