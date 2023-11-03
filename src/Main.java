import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Task1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task3");
        var dog = 12.0;
        var cat = 7.6;
        var paper = 763793;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task4");
        var friend = 19;
        System.out.println("Friend = " + friend);
        friend = friend + 2;
        System.out.println("Friend = " + friend);
        friend = friend / 7;
        System.out.println("Friend = " + friend);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Task5");
        var frog = 3.5;
        System.out.println("Frog = " + frog);
        frog = frog * 10;
        System.out.println("Frog = " + frog);
        frog = frog + 4;
        System.out.println("Frog = " + frog);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Task6");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        System.out.println("Общий вес бойцов = " + (WeightBoxer1 + WeightBoxer2));
        System.out.println("Разница в весе у бойцов составляет = " + (WeightBoxer2 - WeightBoxer1));
        System.out.println();
    }

    public static void task7() {
        System.out.println("Task7");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        System.out.println("Разница в весе у бойцов составляет = " + (WeightBoxer2 - WeightBoxer1));
        System.out.println("Разница в весе у бойцов составляет = " + (WeightBoxer2 % WeightBoxer1));
        System.out.println();
    }

    public static void task8() {
        System.out.println("Task8");
        var totalWorkingHours = 640;
        var employees = totalWorkingHours / 8;
        System.out.println("Всего работников в компании — " + (employees) + " человек");
        System.out.println("Если в компании работает " + (employees + 94) + " человек, то всего " + (employees + 94 * 8) + " часов работы может быть поделено между сотрудниками");
    }

}