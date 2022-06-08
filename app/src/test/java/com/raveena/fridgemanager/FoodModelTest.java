package com.raveena.fridgemanager;

import org.junit.Test;

import static org.junit.Assert.*;

public class FoodModelTest {
@Test
public void getIdTest() {
    FoodModel fm = new FoodModel();
    fm.setId(1);
   // int idWert = fm.getId();
    assertEquals(1,
            fm.getId());
    }
    @Test
    public void getFoodNameTest() {
        FoodModel fm = new FoodModel();
        fm.setFoodName("Zwiebel");
        // String foodName = fm.getFoodName();
        assertEquals("Zwiebel",
                fm.getFoodName());
    }
    @Test
    public void getLocationTest() {
        FoodModel fm = new FoodModel();
        fm.setLocation("A");
        // String loc = fm.getLocation();
        assertEquals("A",
                fm.getLocation());
    }
    @Test
    public void isFrozenTest() {
        FoodModel fm = new FoodModel();
        fm.setFrozen(true);
        // boolean frozenWert = fm.isFrozen();
        assertEquals(true,
                fm.isFrozen());
    }
    @Test
    public void getBoughtDateTest() {
        FoodModel fm = new FoodModel();
        fm.setBoughtDate("01.01.2022");
        // String boughtDate = fm.getBoughtDate();
        assertEquals("01.01.2022",
                fm.getBoughtDate());
    }
    @Test
    public void getCategoryTest() {
        FoodModel fm = new FoodModel();
        fm.setCategory("Vegetables");
        // String loc = fm.getLocation();
        assertEquals("Vegetables",
                fm.getCategory());
    }
    @Test
    public void getExpirationTimeTest() {
        FoodModel fm = new FoodModel();
        fm.setExpirationTime(14);
        // int expTime = fm.getExpirationTime();
        assertEquals(14,
                fm.getExpirationTime());
    }
    @Test
    public void getFinishByDateTest() {
        FoodModel fm = new FoodModel();
        fm.setFinishByDate("15.01.2022");
        // String finishByDate = fm.getFinishByDate();
        assertEquals("15.01.2022",
                fm.getFinishByDate());
    }
    @Test
    public void getFullInfoTest(){
        FoodModel fm = new FoodModel();
        fm.setId(1);
        fm.setFoodName("Zwiebel");
        fm.setLocation("A");
        fm.setFrozen(true);
        fm.setBoughtDate("01.01.2022");
        fm.setCategory("Vegetables");
        fm.setExpirationTime(14);
        fm.setFinishByDate("15.01.2022");
        assertEquals("1, Vegetables, A, Zwiebel, 01.01.2022, 14, 15.01.2022, true",
               fm.getFullInfo());





    }
    /* fm.getId() + ", " +
                        fm.getCategory() + ", " +
        fm.getFoodName() + ", " +
                        fm.getBoughtDate() + ", " +
                        fm.getFinishByDate() + ", " +
                        fm.getExpirationTime() + ", " +


        fm.isFrozen())*/
}