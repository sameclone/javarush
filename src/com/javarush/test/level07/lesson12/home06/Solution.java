package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human mothergrandma = new Human();
        mothergrandma.age=80;
        mothergrandma.sex = false;
        mothergrandma.name = "mothergrandma";

        Human mothergrandfa = new Human();
        mothergrandfa.age=80;
        mothergrandfa.sex = true;
        mothergrandfa.name = "mothergrandfa";

        Human mother = new Human();
        mother.age=20;
        mother.sex = false;
        mother.name = "mother";
        mother.mother = mothergrandma;
        mother.father=mothergrandfa;

        Human fathergrandma = new Human();
        fathergrandma.age=80;
        fathergrandma.sex = false;
        fathergrandma.name = "fathergrandma";

        Human fathergrandfa = new Human();
        fathergrandfa.age=80;
        fathergrandfa.sex = true;
        fathergrandfa.name = "fathergrandfa";


        Human father = new Human();
        father.age=20;
        father.sex = true;
        father.name = "father";
        father.mother = fathergrandma;
        father.father = fathergrandfa;

        Human child1 = new Human();
        child1.age=10;
        child1.sex = true;
        child1.name = "child1";
        child1.mother = mother;
        child1.father = father;

        Human child2 = new Human();
        child2.age=10;
        child2.sex = true;
        child2.name = "child2";
        child2.mother = mother;
        child2.father = father;


        Human child3 = new Human();
        child3.age=10;
        child3.sex = true;
        child3.name = "child2";
        child3.mother = mother;
        child3.father = father;

        System.out.println(fathergrandfa);
        System.out.println(mothergrandfa);

        System.out.println(fathergrandma);
        System.out.println(mothergrandma);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
       String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
