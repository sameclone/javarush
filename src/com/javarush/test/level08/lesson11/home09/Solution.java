package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
          System.out.println( isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String dateString)
    {
        DateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date date = null;
        try
        {
            date = format.parse(dateString);
        //    System.out.println(date);

            Calendar localCalendar = Calendar.getInstance( );
            localCalendar.setTime(date);
            int CurrentDayOfYear = localCalendar.get(Calendar.DAY_OF_YEAR);
            if(CurrentDayOfYear%2==0) return false;
            else return true;

        }
        catch (ParseException e)
        {
            e.printStackTrace();
            return true;
        }


    }
}
