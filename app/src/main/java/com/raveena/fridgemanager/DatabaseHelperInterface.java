package com.raveena.fridgemanager;

import android.database.sqlite.SQLiteDatabase;

import java.util.List;

interface DatabaseHelperInterface {
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion);
    public boolean addFoodItem(FoodModel foodModel);
    public boolean removeFoodItem(FoodModel foodModel);
    public List<FoodModel> getFoodList();
    public List<FoodModel> getExpiryList();
    public boolean getFrozenStatus(int ID);
    public String getDateBought(int ID);
    public String getColumnFoodCategory(int ID);
    public void dry(int ID, String value, String columnItem);
    public void updateFoodName(int ID, String value);
    public void updateFoodLocation(int ID, String value);
    public void updateFoodCategory(int ID, String value);
    public void updateFoodExpirationTime(int ID, int value);
    public void updateFoodBoughtDate(int ID, String value);
    public void updateFoodFinishByDate(int ID, String value);
    public void updateFrozenStatus(int ID, int status);


    }
