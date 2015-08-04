package com.javarush.test.level09.lesson11.home09;

import com.javarush.test.level06.lesson11.home02.Cat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
       Map<String,  Cat> map = new HashMap<String, Cat>();
        map.put("Murzik", new Cat("Murzik"));
        map.put("Murzik1", new Cat("Murzik1"));
        map.put("Murzik2", new Cat("Murzik2"));
        map.put("Murzik3", new Cat("Murzik3"));
        map.put("Murzik4", new Cat("Murzik4"));
        map.put("Murzik5", new Cat("Murzik5"));
        map.put("Murzik6", new Cat("Murzik6"));
        map.put("Murzik7", new Cat("Murzik7"));
        map.put("Murzik8", new Cat("Murzik8"));
        map.put("Murzik9", new Cat("Murzik9"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {

        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> entry : map.entrySet())
        {

            set.add(entry.getValue());
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
