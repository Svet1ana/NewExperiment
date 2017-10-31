package HomeWork;

import java.util.*;



public class Reader {
    double firstnum;
    double secondnum;
    double operate;
    char operation;

    public void Scan () {

        System.out.println("Введите первое чсисло");

        Scanner scn = new Scanner(System.in);
        firstnum = scn.nextDouble();
        //if (firstnum instanceof!=float)
        //{
        //    System.out.println("Введите число!");
        //    Scanner scn = new Scanner(System.in);
        //};
        System.out.println("Введите опертор: + или -, * или /, %");

        operation = scn.next().charAt(0);

        System.out.println("Введите второе чсисло");
        secondnum = scn.nextDouble();
        switch (operation) {
            case '+':
                System.out.println("\n Сумма чисел " + firstnum + " и " + secondnum +  " равна "+ (firstnum + secondnum));
                break;
            case '-':
                System.out.println("\n Разница чисел " + firstnum + " и " + secondnum +  " равна "+ (firstnum - secondnum));
                break;
            case '*':
                System.out.println("\n Произведение чисел " + firstnum + " и " + secondnum +  " равно "+ (firstnum * secondnum));
                break;
            case '%':
                System.out.println("\n Остаток от деления " + firstnum + " и " + secondnum +  " равен "+ (firstnum % secondnum));
                break;

            default: System.out.println("\n Введите корректное значение оператора"); }
        }

    }
