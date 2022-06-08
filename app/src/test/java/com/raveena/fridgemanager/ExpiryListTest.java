package com.raveena.fridgemanager;

import org.junit.Assert;
import org.junit.Test;

public class ExpiryListTest {
    @Test
    public void daysLeftTest(){
        ExpiryList el = new ExpiryList();
        Assert.assertEquals(11, el.daysLeft("2022-06-14"));
    }

}