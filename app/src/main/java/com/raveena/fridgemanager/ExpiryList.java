package com.raveena.fridgemanager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

/**
 * This class is in charge of dealing with the list of items and when they will expire. Data
 * is given from the Database Helper class and a ListView displays the items
 */

public class ExpiryList extends AppCompatActivity {
    private List<String> expiryList;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expiry_list);

        // Setting up the expiry list
        ListView expiryList = findViewById(R.id.expiryListView);
        DatabaseHelper db = new DatabaseHelper(getApplicationContext());
        List <FoodModel> list = db.getExpiryList();

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>
                (ExpiryList.this, android.R.layout.simple_list_item_1,
                        getExpiryList(list) );
        expiryList.setAdapter(arrayAdapter);

        // Making back fab go back to home (dashboard) page
        FloatingActionButton back = findViewById(R.id.fab_backExpiry);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(getApplicationContext(), DashboardNavigation.class);
                startActivity(goBack);
            }
        });

        expiryList.setOnItemClickListener(null);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public List<String> getExpiryList(List <FoodModel> fl) {
            expiryList = ExpiredElementsBase.get().getExpiryList();
          /*  for (int i = 0; i < fl.size(); i++) {
                long days = daysLeft(fl.get(i).getFinishByDate());
                String line = "";
                if (days < 0) {
                    line = fl.get(i).getFoodName() + " \t\t ~ EXPIRED ALREADY";
                } else {
                    line = fl.get(i).getFoodName() + " \t\t ~ " + days
                            + " Days Left";
                }
                list.add(line);
            }*/
            return expiryList;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public long daysLeft(String date) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String todayString = format1.format(cal.getTime());

        long diff = 0;
        try {
            Date givenDate = format1.parse(date);
            Date today = format1.parse(todayString);
            diff = givenDate.getTime() - today.getTime();
            System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    // To display the 3 dots in Action Bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        DashboardNavigation dn = new DashboardNavigation();
        return dn.onOptionsItemSelected(item);
       /* Intent goToActivity;
        if (item.getItemId() == R.id.settings) {
            goToActivity = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(goToActivity);
            return true;
        } else if (item.getItemId() == R.id.help) {
            goToActivity = new Intent(getApplicationContext(), HelpActivity.class);
            startActivity(goToActivity);
            return true;
        } else if (item.getItemId() == R.id.Contact) {
            goToActivity = new Intent(getApplicationContext(), ContactActivity.class);
            startActivity(goToActivity);
            return true;
        } else if (item.getItemId() == R.id.About) {
            goToActivity = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(goToActivity);
            return true;
        }
        return false;*/
    }
}