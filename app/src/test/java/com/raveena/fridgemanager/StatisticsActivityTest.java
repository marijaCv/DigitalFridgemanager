package com.raveena.fridgemanager;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class  StatisticsActivityTest {

@Test
    public void displayCategoryStatsTest(){
    ArrayList<FoodModel> xDataCopy = new ArrayList<>();
    FoodModel fm = new FoodModel(1, "Paprika", "Vegetables", "Lidl", false);
    FoodModel fm2 = new FoodModel(2, "Hackfleisch", "Meat &/Or Eggs", "Edeka", true);
    xDataCopy.add(fm);
    xDataCopy.add(fm2);
    StatisticsActivity sa = new StatisticsActivity();
    Assert.assertEquals("Categories", sa.displayCategoryStats(xDataCopy));
}

    @Test
public void findTop3StoresTest(){
        ArrayList<FoodModel> xDataCopy = new ArrayList<>();
        FoodModel fm = new FoodModel(1, "Paprika", "Vegetables", "Lidl", false);
        FoodModel fm2 = new FoodModel(2, "Hackfleisch", "Meat &/Or Eggs", "Lidl", true);
        FoodModel fm3 = new FoodModel(3, "Zitrone", "Fruits", "Edeka", false);
        xDataCopy.add(fm);
        xDataCopy.add(fm2);
        xDataCopy.add(fm3);
        ArrayList<String> countStores = new ArrayList<>();
        countStores.add("Lidl Count: 2");
        countStores.add("Edeka Count: 1");
        StatisticsActivity sa = new StatisticsActivity();
        Assert.assertEquals(countStores, sa.findTop3Stores(xDataCopy));
    }
}