public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 0");
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);

    }
    public static void task2 () {
        System.out.println("Задача 1-3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 4-5");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task4 () {
        System.out.println("Задача 6-8");
        var первыйБоец = 78.2;
        var второйБоец = 82.7;
        var весДвоихБойцов = первыйБоец + второйБоец;
        System.out.println("Общий вес двух бойцов " + весДвоихБойцов + " кг");
        var разница = второйБоец - первыйБоец;
        System.out.println("разница весов спортсменов " + разница + " кг");
        var разницаДва = второйБоец % первыйБоец;
        System.out.println("вторая разница весов спортсменов " + разницаДва + " кг");

        var всегоЧасов = 640;
        var рабочийДень = 8;
        var всегоРаботников = всегоЧасов / рабочийДень;
        System.out.println("Всего работников в компании - " + всегоРаботников + " человек");
        var новыхСотрудников = 94;
        var всегоСотрудников = всегоРаботников + новыхСотрудников;
        var всегоЧасовРаботы = (всегоРаботников + новыхСотрудников) * рабочийДень;
        System.out.println("Если в компании работает " + всегоСотрудников + " человек, то всего " + всегоЧасовРаботы + " часов работы может быть поделено между сотрудниками");

    }
}