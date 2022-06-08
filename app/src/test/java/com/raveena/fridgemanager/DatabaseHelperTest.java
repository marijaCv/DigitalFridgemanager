package com.raveena.fridgemanager;

import android.database.sqlite.SQLiteDatabase;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DatabaseHelperTest {
    @Test
    public void getFrozenStatusTest(){
        DatabaseHelperInterface dh = new DatabaseHelperInterface() {
            //dh.getFrozenStatus(1);
            @Override
            public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            }

            @Override
            public boolean addFoodItem(FoodModel foodModel) {
                return false;
            }

            @Override
            public boolean removeFoodItem(FoodModel foodModel) {
                return false;
            }

            @Override
            public List<FoodModel> getFoodList() {
                return null;
            }

            @Override
            public List<FoodModel> getExpiryList() {
                return null;
            }

            @Override
            public boolean getFrozenStatus(int ID) {
                return false;
            }

            @Override
            public String getDateBought(int ID) {
                return null;
            }

            @Override
            public String getColumnFoodCategory(int ID) {
                return null;
            }

            @Override
            public void dry(int ID, String value, String columnItem) {

            }

            @Override
            public void updateFoodName(int ID, String value) {

            }

            @Override
            public void updateFoodLocation(int ID, String value) {

            }

            @Override
            public void updateFoodCategory(int ID, String value) {

            }

            @Override
            public void updateFoodExpirationTime(int ID, int value) {

            }

            @Override
            public void updateFoodBoughtDate(int ID, String value) {

            }

            @Override
            public void updateFoodFinishByDate(int ID, String value) {

            }

            @Override
            public void updateFrozenStatus(int ID, int status) {

            }

        };
        Assert.assertEquals(false,dh.getFrozenStatus(1));

    }

}