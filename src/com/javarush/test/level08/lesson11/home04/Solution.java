package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
       {
           synchronized(Solution.class ){
            List<Integer> integerList =   getIntegerList();



               System.out.println(getMinimum(integerList));
           }

        }
    }

    public     static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for(Integer k: array)
        {
            if(min>k) min = k;
        }

        return min;
    }

    public     static List<Integer> getIntegerList() throws IOException
    {
        //create and initialize a list here - создать и заполнить список тут
        List<Integer> array = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            Integer n = Integer.parseInt(reader.readLine());

            for (int i = 0; i < n; i++)
            {

                int k = Integer.parseInt(reader.readLine());

                array.add(k);


        }


        return array;
    }
}
