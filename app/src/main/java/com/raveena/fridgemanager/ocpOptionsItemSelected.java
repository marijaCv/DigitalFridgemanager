package com.raveena.fridgemanager;

import android.view.MenuItem;

import androidx.annotation.NonNull;
//OPEN CLOSED PRINCIPLE: interface that is the same for each Activity
interface ocpOptionsItemSelected {

 public boolean activity(@NonNull MenuItem item);




}
