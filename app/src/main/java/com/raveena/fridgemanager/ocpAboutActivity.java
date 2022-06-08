package com.raveena.fridgemanager;

import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//OPEN CLOSED PRINCIPLE: interface that is the same for each Activity

class ocpAboutActivity extends AppCompatActivity implements ocpOptionsItemSelected{
   @Override
   public boolean activity(@NonNull MenuItem item) {
      Intent goToActivity;
      goToActivity = new Intent(getApplicationContext(), AboutActivity.class);
      startActivity(goToActivity);
      return true;

   }
}
