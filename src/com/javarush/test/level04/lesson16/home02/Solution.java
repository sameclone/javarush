package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp = reader.readLine();

        int one = Integer.parseInt(tmp);

        tmp = reader.readLine();

        int two = Integer.parseInt(tmp);

        tmp = reader.readLine();

        int three = Integer.parseInt(tmp);

        if (max(max(one, two), three) == one)
        {
            if (min(two, three) == two) System.out.println(three);
            else System.out.println(two);
        } else if (max(max(one, two), three) == two)
        {
            if (min(three, one) == two) System.out.println(one);
            else System.out.println(three);
        } else if (max(max(one, two), three) == three)
        {
            if (min(two, one) == two) System.out.println(one);
            else System.out.println(two);
        }

    }

    public static int min(int a, int b)
    {
        if (a <= b) return a;
        return b;
    }

    public static int max(int a, int b)
    {
        if (a >= b) return a;
        return b;
    }
}
