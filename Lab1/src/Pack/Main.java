/*
22.	Визначити суму N перших чисел Люка (спробуйте вивести і перевірити відповідну формулу).
 */


/**
 * власний пакет для класів Main і Luka
 * @author Міліневський Максим
 */
package Pack;

import java.awt.*;
import java.util.Scanner;

/**
 * основний клас Main
 * * @author Міліневський Максим
 */
public class Main {
    /**
     * конструктор класу Main(за замовчуванням)
     */
    public Main()
    {
    }

    /**
     * метод вводу розміра масиву чисел Люка
     * @return розмір даного масиву
     */
    public static int Size()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scan.nextInt();
        return size;
    }
    /**
     * метод створення ,заповнення і виведення масиву класу {@link Luka} з параметрами номер  і значення числа Люка
     * @param size - розмір масиву
     * @return масив чисел Люка
     */
    public static Luka[] CreateArr(int size)
    {
        Luka[] Arr = new Luka[size];
        Arr[0] = new Luka( 0, 2);
        Arr[1] = new Luka(1,1);
        System.out.print(Arr[0].getNumb() + "  " + Arr[0].getData() + "\n");
        System.out.print(Arr[1].getNumb() + "  " + Arr[1].getData() + "\n");
        for(int i = 2;i < size;i++)
        {
            Arr[i] = new Luka(i,Arr[i - 1].getData() + Arr[i-2].getData());
            System.out.print(Arr[i].getNumb() + "  " + Arr[i].getData() + "\n");
        }
        return Arr;
    }

    /**
     * метод знаходження чисел Люка , які є трикутними числами
     * @param Arr масив чисел Люка
     * @param size розмір масиву Arr
     */
    public static void Solve(Luka[] Arr,int size)
    {
        /*int n = 0;
        System.out.println("\nThe result:");
        for(int i = 0;i < size;i++)
        {
            for(int j = 1;n <= Arr[i].getData();j++)
            {
                if(n == Arr[i].getData())
                {
                    System.out.println(n);
                }

                n = n + j;
            }
            n = 0;
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum += Arr[i].getData() * Arr[i].getData();
        }
        System.out.println("\nThe result:" + sum);

    }

    /**
     * основний метод класу Main
     * @param args значення командного рядку
     */
    public static void main(String[] args) {
        int s = Size();
        int size = 5;
        Luka[] Arr = new Luka[size];
        Luka[] Array = CreateArr(s);
        Solve(Array,s);
    }
}