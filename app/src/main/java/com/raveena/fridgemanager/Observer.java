package com.raveena.fridgemanager;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

interface Observer {
public void update( String category,
        String location,
        String foodName,
        String boughtDate,
        int expirationTime,    // Based on category, gives days it expires in
        String finishByDate,    // actually the date food expires
        boolean isFrozen);
}
