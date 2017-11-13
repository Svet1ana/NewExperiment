package HomeWork;

import java.util.*;


public class Reader {

    public void scan() {

        //double firstNum;
        //double secondNum;
        //char operation;

        System.out.println("Введите первое чсисло");

        Scanner scn = new Scanner(System.in);
        double firstNum = scn.nextDouble();

        System.out.println("Введите опертор: + или -, * или /, %");

        char operation = scn.next().charAt(0);

        System.out.println("Введите второе чсисло");
        double secondNum = scn.nextDouble();
        switch (operation) {
            case '+':
                System.out.println("\n Сумма чисел " + firstNum + " и " + secondNum +  " равна "+ (firstNum + secondNum));
                break;
            case '-':
                System.out.println("\n Разница чисел " + firstNum + " и " + secondNum +  " равна "+ (firstNum - secondNum));
                break;
            case '*':
                System.out.println("\n Произведение чисел " + firstNum + " и " + secondNum +  " равно "+ (firstNum * secondNum));
                break;
            case '/':
                // ЭТА ШТУКА ОТРАБАТЫВАЕТ ИНАЧЕ, ЧЕМ try catch НИЖЕ :(
               /* if (secondNum != 0) {
                    System.out.println("\n Деление чисел " + firstNum + " и " + secondNum + " равно " + (firstNum / secondNum));
                }
                else
                 throw new RuntimeException();*/

               //
                try {
                    System.out.println("\n Деление чисел " + firstNum + " и " + secondNum + " равно " + (firstNum / secondNum));
                } catch (ArithmeticException e) {
                    System.out.println("Произошла недопустимая арифметическая операция");
                }
                    break;
            case '%':
                System.out.println("\n Остаток от деления " + firstNum + " и " + secondNum +  " равен "+ (firstNum % secondNum));
                break;

            default: System.out.println("\n Введите корректное значение оператора"); }
        }

    }
