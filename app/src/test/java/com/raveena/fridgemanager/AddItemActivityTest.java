package com.raveena.fridgemanager;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddItemActivityTest {
@Test
    public void addCategoryNamesTest(){
    AddItemActivity aia = new AddItemActivity();
    List<String> cat = new ArrayList<>();
    aia.addCategoryNames(cat);
    cat.add("Pick a category");
    cat.add("Fruits");
    cat.add("Fruits");
    cat.add("Vegetables");
    cat.add("Dairy");
    cat.add("Grains");
    cat.add("Meat &/Or Eggs");
    cat.add("Fish");
    cat.add("Other");
    assertEquals(8, aia.getCategoryNames().size());

}

}