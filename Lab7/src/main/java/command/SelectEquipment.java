package command;

import data.EquipmentData;
import data.KnightData;
import data.WeaponData;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SelectEquipment implements InterfaceConsole{
    private KnightData elem1;
    private EquipmentData list;
    private ArrayList<EquipmentData> e;
    @Override
    public CommandResult<String> execute() throws Exception {
        Scanner scan = new Scanner(System.in);
        int size;
        if(elem1.getSize() < 1)
        {
            System.out.println("Enter сount of knights:");
            size = scan.nextInt();
            elem1.fillKnight(size);
            elem1.printList(elem1.getSize());
        }
        else
        {
            size = elem1.getSize();
            elem1.printList(elem1.getSize());
        }
        list.fillEquipment();
        //list.printList();
        //Random random = new Random();
        for(int i = 0;i < size;i++)
        {
            if(e.size() > 0)
            {
                e.add(i,new EquipmentData());
                if(e.get(i).getSize() > 0)
                {
                    System.out.println("Error!This knight have equipment");
                }
                else
                {
                    equip(i);
                    e.get(i).printList();
                    double sum = e.get(i).getSummaryCost();
                    System.out.println("Your equipment costs " + sum);
                }
            }
            else
            {
                e.add(i,new EquipmentData());
                equip(i);
                e.get(i).printList();
                double sum = e.get(i).getSummaryCost();
                System.out.println("Your equipment costs " + sum);
            }

        }
        System.out.println("Select equipment works!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","Select equipment works!",true);
        return result;
    }
    public void equip(int i)
    {
        Scanner scan = new Scanner(System.in);
        int ch = 1;
        int count_of_chosen = 0;
        int ch_elem;
        boolean isHelmet = false;
        boolean isPlate = false;
        boolean isBoots = false;
        boolean isShield = false;
        double money = elem1.getElem(i).getAvailable_money();
        while (ch != 0 && money > 0.0)
        {
            System.out.println("Enter what equipment do you want to select for your knight:"
                    + "\nHelmet - 1" + "\nBreastplate - 2" + "\nBoots - 3" + "\nShield - 4" + "\nNext knight or exit - 0");
            ch = scan.nextInt();
            if(ch == 1 && !isHelmet)
            {
                list.Filter(0,250);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_elem = scan.nextInt();
                ch_elem -= 1;
                while (ch_elem > 249 || ch_elem < 0)
                {
                    ch_elem = scan.nextInt();
                    ch_elem -= 1;
                }
                if(money - list.getElem(ch_elem).getCost() > 0)
                {
                    money -= list.getElem(ch_elem).getCost();
                    e.get(i).addElem(list.getElem(ch_elem),count_of_chosen);
                    isHelmet = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if(ch == 2 && !isPlate)
            {
                list.Filter(250,500);
                //list.FilterParam(250,500);
                System.out.println("Enter the number of element that you want to buy:");
                ch_elem = scan.nextInt();
                ch_elem -= 1;
                while (ch_elem > 499 || ch_elem < 250)
                {
                    ch_elem = scan.nextInt();
                    ch_elem -= 1;
                }
                if(money - list.getElem(ch_elem).getCost() > 0)
                {
                    money -= list.getElem(ch_elem).getCost();
                    e.get(i).addElem(list.getElem(ch_elem),count_of_chosen);
                    isPlate = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if(ch == 3 && !isBoots)
            {
                list.Filter(500,750);
                //list.FilterParam(500,750);
                System.out.println("Enter the number of element that you want to buy:");
                ch_elem = scan.nextInt();
                ch_elem -= 1;
                while (ch_elem > 749 || ch_elem < 500)
                {
                    ch_elem = scan.nextInt();
                    ch_elem -= 1;
                }
                if(money - list.getElem(ch_elem).getCost() > 0)
                {
                    money -= list.getElem(ch_elem).getCost();
                    e.get(i).addElem(list.getElem(ch_elem),count_of_chosen);
                    isBoots = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if(ch == 4 && !isShield)
            {
                list.Filter(750,1000);
                //list.FilterParam(750,1000);
                System.out.println("Enter the number of element that you want to buy:");
                ch_elem = scan.nextInt();
                ch_elem -= 1;
                while (ch_elem > 999 || ch_elem < 750)
                {
                    ch_elem = scan.nextInt();
                    ch_elem -= 1;
                }
                if(money - list.getElem(ch_elem).getCost() > 0)
                {
                    money -= list.getElem(ch_elem).getCost();
                    e.get(i).addElem(list.getElem(ch_elem),count_of_chosen);
                    isShield = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            System.out.println("Available money is " + money);
            elem1.getElem(i).setAvailable_money(money);
        }
    }

    public SelectEquipment(KnightData elem, EquipmentData list, ArrayList<EquipmentData> e) {
        this.elem1 = elem;
        this.list = list;
        this.e = e;
    }
}
