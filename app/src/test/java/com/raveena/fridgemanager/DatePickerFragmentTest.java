package com.raveena.fridgemanager;

import android.app.DatePickerDialog;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class DatePickerFragmentTest {

   private FoodModel fm;

   @Mock
   private DatePickerFragment dpf;
   @Before
   public void beforeDatePickerFragmentStart(){
      MockitoAnnotations.initMocks(this);
   }
   @Test
   public void datePickerTest(){

      DatePickerDialog resultDialog = (DatePickerDialog) dpf.generateDialog();

      Calendar c = Calendar.getInstance();
      int year = c.get(Calendar.YEAR);
      int month = c.get(Calendar.MONTH);
      int day = c.get(Calendar.DAY_OF_MONTH);

      assertEquals(resultDialog.getDatePicker().getDayOfMonth(), day);
      assertEquals(resultDialog.getDatePicker().getMonth(), month);
      assertEquals(resultDialog.getDatePicker().getYear(), year);

   }
}