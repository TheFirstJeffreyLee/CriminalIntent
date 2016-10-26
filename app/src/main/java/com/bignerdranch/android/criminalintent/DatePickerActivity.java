package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.Layout;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import java.util.Date;
import java.util.UUID;

/**
 * Created by jlee on 10/26/16.
 */

public class DatePickerActivity extends SingleFragmentActivity {
    public static final String EXTRA_DATE = "date";
    private FrameLayout mDateLayout;

    @Override
    protected Fragment createFragment() {
        Date date = (Date) getIntent().getSerializableExtra(EXTRA_DATE);
        return DatePickerFragment.newInstance(date);
    }

    public static Intent newIntent(Context packageContext, Date date) {
        Intent intent = new Intent(packageContext, DatePickerActivity.class);
        intent.putExtra(EXTRA_DATE, date);
        return intent;
    }
}
