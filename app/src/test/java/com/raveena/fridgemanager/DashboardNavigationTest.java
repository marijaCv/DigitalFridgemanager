package com.raveena.fridgemanager;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DashboardNavigationTest {
    @Test
    public void daysLeftTest() {

       DashboardNavigation dn = new DashboardNavigation();
        String date = "2022-06-14";
        assertEquals(11, dn.daysLeft(date));
    }

}