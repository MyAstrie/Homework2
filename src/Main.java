public class Main {
    public static void homework1()
    {
        System.out.println("Домашнее задание - 1");

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 1:");
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        System.out.println("Задача 2:");
        dog += 4;
        cat += 4;
        paper +=4;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);

        System.out.println("Задача 3:");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
    }

    public static void homework2(){
        System.out.println("Домашнее задание - 2");

        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println("1) friend = " + friend);

        friend += 2;
        System.out.println("2) friend = " + friend);

        friend /= 7;
        System.out.println("3) friend = " + friend);

        System.out.println("Задача 5:");
        var frog = 3.5;
        System.out.println("1) frog = " + frog);

        frog *= 10;
        System.out.println("2) frog = " + frog);

        frog /= 3.5;
        System.out.println("3) frog = " + frog);

        frog += 4;
        System.out.println("4) frog = " + frog);
    }

    public static void homework3() {
        System.out.println("Домашнее задание - 3");

        System.out.println("Задача 6:");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;

        var sumBoxerWeight = secondBoxer + firstBoxer;
        System.out.println("Суммарный вес боксеров = " + sumBoxerWeight);

        var diffBoxerWeight = Math.abs(secondBoxer - firstBoxer);
        System.out.println("Разница веса боксеров = " + diffBoxerWeight);

        System.out.println("Задача 7:");
        var modDiffBoxerWeight = secondBoxer % firstBoxer;
        System.out.println("Разница веса боксеров (вычитание)= " + diffBoxerWeight);
        System.out.println("Разница веса боксеров (остаток) = " + modDiffBoxerWeight);

        System.out.println("Задача 8:");
        var countWorkers = 640 / 8;
        System.out.println("Всего работников в компании – " + countWorkers);

        countWorkers += 94;
        var  totalHours = countWorkers * 8;
        System.out.println("Если в компании работает – " + countWorkers +
                " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }

    public static void main(String[] args) {
        homework1();
        System.out.println("---------");

        homework2();
        System.out.println("---------");

        homework3();
    }
}