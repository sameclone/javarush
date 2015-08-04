package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        Human mother;
        Human father;
        int age;
        int weight;
        int height;

        public Human(){} //1

        public Human(String name)//2
        {
            this.name = name;
        }

        public Human(String name, Human mother)//3
        {
            this.name = name;
            this.mother=mother;
        }

        public Human(String name, int age) //4
        {
            this.name  =name;
            this.age=age;
        }

        public Human(String name, int age, int weight) //5
        {
            this.name  =name;
            this.age=age;
        }

        public Human(String name, int age, int weight, int height) //6
        {
            this.name  =name;
            this.age=age;
            this.height = height;
        }

        public Human(String name, int age, int weight, int height, Human mother) //7
        {
            this.name  =name;
            this.age=age;
            this.height = height;
            this.mother = mother;
        }

        public Human(String name, int age, int weight, int height, Human mother, Human father) //8
        {
            this.name  =name;
            this.age=age;
            this.height = height;
            this.mother = mother;
            this. father = father;
        }

        public Human(String name,   Human mother, Human father) //9
        {
            this.name  =name;

            this.mother = mother;
            this. father = father;
        }

        public Human(String name,  int age,  Human mother, Human father) //10
        {
            this.name  =name;
            this.age = age;
            this.mother = mother;
            this. father = father;
        }
    }



}
