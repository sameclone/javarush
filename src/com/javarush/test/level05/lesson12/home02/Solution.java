package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут

        Man man1 = new Man("man1", 21, "address");
        Man man2 = new Man("man2", 21);

        Woman woman1 = new Woman("wonam1");
        Woman woman2 = new Woman("wonam1", 22);
        // Выведи их на экран тут

        System.out.println(man1);
        System.out.println(man2);

        System.out.println(woman1);
        System.out.println(woman1);

    }

    public static class Man
    {
        public String name;
        public int age = 0;
        public String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;

        }

        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;

        }

        public Man(String name)
        {
            this.name = name;


        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }


    }


    public static class Woman
    {
        public String name;
        public int age = 0;
        public String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;

        }

        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;

        }

        public Woman(String name)
        {
            this.name = name;


        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }


    }
}
