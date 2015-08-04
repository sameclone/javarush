package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH );
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dateString = reader.readLine();
        Date date = null;
        date = format.parse(dateString);


        DateFormat format2 = new SimpleDateFormat("MMM d, yyyy",Locale.ENGLISH );
        System.out.println(    (format2.format(date).toUpperCase()));
    }
}
