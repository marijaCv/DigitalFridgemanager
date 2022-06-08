package com.raveena.fridgemanager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class EditFoodItemTest {

    @Test
    public void assignExpiryTimeTest(){
        EditFoodItem efi = new EditFoodItem();
        int frozenStatus = efi.assignExpiryTime("Fruits", false);
        assertEquals(14, frozenStatus);
        int frozenStatus2 = efi.assignExpiryTime("Fish", true);
        assertEquals(30,frozenStatus2);

    }

    @Test
    public void modifiedExpirationDateTest(){
        EditFoodItem efi = new EditFoodItem();
        assertEquals("2022-06-12",efi.modifiedExpirationDate("2022-06-01", 11));
    }


}