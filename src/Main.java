public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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

    public static void task2()  {
        System.out.println("Task2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog+4;
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
        dog = dog- 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);

    }


}