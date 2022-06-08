package com.raveena.fridgemanager;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ContactActivityTest {
    @Test
    public void isEmailValidTest() {

        assertTrue(ContactActivity.isEmailValid("name@gmail.com"));

    }


}