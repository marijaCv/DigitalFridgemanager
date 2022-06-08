package com.raveena.fridgemanager;

import android.os.Build;

import java.util.ArrayList;
import java.util.List;
// SINGLETON
// SINGLETON
// SINGLETON
// SINGLETON
// SINGLETON

import androidx.annotation.RequiresApi;
/* Singleton Object is now the owner of the expiry list. If you want to add, edit, delete a single data
* you ask a singleton object for it. */
class ExpiredElementsBase {
   private List<String> mList;
   List<FoodModel> fm;
   ExpiryList el = new ExpiryList();

   //constructor
   @RequiresApi(api = Build.VERSION_CODES.O)
   private ExpiredElementsBase() {
      mList = new ArrayList<>();
      for (int i = 0; i < fm.size(); i++) {
         long days = el.daysLeft(fm.get(i).getFinishByDate());
         String line = "";
         if (days < 0) {
            line = fm.get(i).getFoodName() + " \t\t ~ EXPIRED ALREADY";
         } else {
            line = fm.get(i).getFoodName() + " \t\t ~ " + days
                    + " Days Left";
         }
         mList.add(line);
      }
   }
   public List<String> getExpiryList(){
      return mList;
   }
   //Singleton Object
   private static ExpiredElementsBase mExpiredElementsBase;

   //returning singleton object
   @RequiresApi(api = Build.VERSION_CODES.O)
   public static ExpiredElementsBase get(){
      mExpiredElementsBase = new ExpiredElementsBase();
      if (mExpiredElementsBase == null){
         mExpiredElementsBase = new ExpiredElementsBase();
      }
      return mExpiredElementsBase;
   }
}
