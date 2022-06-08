package com.raveena.fridgemanager;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

interface RefactorStatistics {
 boolean onOptionsItemSelected();
}
class Settings extends AppCompatActivity implements  RefactorStatistics{
 @Override
 public boolean onOptionsItemSelected() {
  Intent goToActivity;
  goToActivity = new Intent(getApplicationContext(), SettingsActivity.class);
  startActivity(goToActivity);
  return true;
 }
}
class Help extends AppCompatActivity implements  RefactorStatistics{
 @Override
 public boolean onOptionsItemSelected() {
  Intent goToActivity;
  goToActivity = new Intent(getApplicationContext(), HelpActivity.class);
  startActivity(goToActivity);
  return true;
 }
}
class Contact extends AppCompatActivity implements  RefactorStatistics{
 @Override
 public boolean onOptionsItemSelected() {
  Intent goToActivity;
  goToActivity = new Intent(getApplicationContext(), ContactActivity.class);
  startActivity(goToActivity);
  return true;
 }
}

class About extends AppCompatActivity implements  RefactorStatistics{
 @Override
 public boolean onOptionsItemSelected() {
  Intent goToActivity;
  goToActivity = new Intent(getApplicationContext(), AboutActivity.class);
  startActivity(goToActivity);
  return true;
 }
}
