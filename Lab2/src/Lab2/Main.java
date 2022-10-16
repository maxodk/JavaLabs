package Lab2;
import Lab2.phone.Phone;

import java.util.Scanner;

/**
 * основний клас Main
 * @author Максим Міліневський
 */
public class Main {
    /**
     * метод пошуку обєктів класу , що мають час міських розмов вище , ніж задане значення
     * @param Arr - масив обєктів класу Phone
     * @param size - розмір масиву обєктів
     */
    public static void FindTimeIn(Phone[] Arr,int size)
    {
        int prtimein;
        System.out.print("Enter numb:");
        Scanner scan = new Scanner(System.in);
        prtimein = scan.nextInt();
        for(int i = 0;i < size;i++)
        {
            if(Arr[i].getTimeIn() > prtimein)
            {
                System.out.print("User" + (i + 1) + "\n" + Arr[i].toString() + "\n--------------------------\n");
            }
        }
    }

    /**
     * метод пошуку обєктів класу , які користувались міжміськими розмовами
     * @param Arr - масив обєктів класу Phone
     * @param size - розмір масиву
     */
    public static void FindTimeOut(Phone[] Arr,int size)
    {
        for(int i = 0;i < size;i++)
        {
            if(Arr[i].getTimeout() > 0)
            {
                System.out.print("User" + (i + 1) + "\n" + Arr[i].toString() + "\n--------------------------\n");
            }
        }
    }

    /**
     * метод пошуку обєктів класу з номером рахунку в заданому інтервалі
     * @param Arr - масив обєктів класу Phone
     * @param size - розмір масиву
     */
    public static void FindInterval(Phone[] Arr,int size)
    {
        int i1,i2;
        System.out.print("Enter numb1:");
        Scanner scan = new Scanner(System.in);
        i1= scan.nextInt();
        System.out.print("Enter numb2:");
        i2= scan.nextInt();
        for(int i = 0;i < size;i++)
        {
            if(Arr[i].getNumb() > i1 && Arr[i].getNumb() < i2)
            {
                System.out.print("User" + (i + 1) + "\n" + Arr[i].toString() + "\n--------------------------\n");
            }
        }
    }

    /**
     * метод задання розміру масиву обєктів
     * @return розмір масиву
     */
    public static int SetSize()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scan.nextInt();
        return size;
    }

    /**
     * метод створення і заповнення масиву обєктів класу Phone
     * @param size - розмір масиву
     * @return масив обєктів
     */
    public static Phone[] CreateArr(int size)
    {
        Phone[] Arr = new Phone[size];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < size;i++)
        {
            System.out.print("Enter id:");
            int id = scan.nextInt();
            System.out.print("Enter Fname:");
            String fname = scan.next();
            System.out.print("Enter mname:");
            String mname = scan.next();
            System.out.print("Enter lname:");
            String lname = scan.next();
            System.out.print("Enter numb:");
            int numb = scan.nextInt();
            System.out.print("Enter timein:");
            int timein = scan.nextInt();
            System.out.print("Enter timeout:");
            int timeout = scan.nextInt();
            Arr[i] = new Phone(id,fname,mname,lname,numb,timein,timeout);
        }
        return Arr;
    }

    /**
     * метод вивводу масиву в консольне вікно
     * @param Arr - масив обєктів
     * @param size - розмір масиву
     */
    public static void PrintArr(Phone[] Arr,int size)
    {
        for(int i = 0;i < size;i++)
        {
            System.out.print("User" + (i + 1) + "\n" + Arr[i].toString() + "\n--------------------------\n");
        }
    }

    /**
     * метод виклику 3 перших методів через введення відповідного числа
     * @param Arr - масив обєктів
     * @param size - розмір масиву
     */
    public static void Choise(Phone[] Arr,int size)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ch:");
        int ch = scan.nextInt();
        while(ch != 0)
        {
            switch (ch)
            {
                case 1:
                    FindTimeIn(Arr, size);
                    System.out.print("\033[H\033[J");
                    break;
                case 2:
                    FindTimeOut(Arr, size);
                    System.out.print("\033[H\033[J");
                    break;
                case 3:
                    FindInterval(Arr, size);
                    System.out.print("\033[H\033[J");
                    break;
                default:
                    break;
            }
            System.out.print("Enter ch:");
            ch = scan.nextInt();
        }
    }

    /**
     * метод Main
     * @param args параметри командного рядка
     */
    public static void main(String[] args)
    {
        int s = SetSize();
        Phone[] arr = CreateArr(s);
        System.out.print("\033[H\033[J");
        PrintArr(arr,s);
        Choise(arr,s);
    }
}