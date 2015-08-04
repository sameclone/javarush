package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("12345");
        list1.add("123456789");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("12345ewrwer");
        list2.add("123456789werwqrwrewqre");
        ArrayList<String> list3=new ArrayList<String>();
        list3.add("lol3");
        list3.add("blablabla");
        list3.add("lol3ddd");
        list3.add("blablablaaswdasd");

      ArrayList<String>[] array = new ArrayList[3];

        array[0] = list1;
        array[1] =list2;
        array[2]=list3;


        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}