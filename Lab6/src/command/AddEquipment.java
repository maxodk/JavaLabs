package command;

import data.EquipmentData;
import data.KnightData;
import data.WeaponData;

import java.util.ArrayList;
import java.util.Scanner;

public class AddEquipment implements InterfaceConsole{
    private KnightData elem1;
    private EquipmentData list;
    private ArrayList<EquipmentData> e;
    private WeaponData wlist;
    private ArrayList<WeaponData> w;
    @Override
    public CommandResult<String> execute() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter what you want:select equipment or select weapon?");
        int ch = scan.nextInt();
        if(ch == 0)
        {
            addEquip();
        }
        else
        {
            addWeapon();
        }
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!","Add working!",true);;
        return result;
    }
    public AddEquipment(KnightData elem, EquipmentData list, ArrayList<EquipmentData> e,WeaponData wlist,ArrayList<WeaponData> w) {
        this.elem1 = elem;
        this.list = list;
        this.e = e;
        this.wlist = wlist;
        this.w = w;
    }
    public void addEquip()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter for what knight do you want to add equipment?");
        int ch_elem = scan.nextInt();
        while (ch_elem >= elem1.getSize() || ch_elem < 0)
        {
            System.out.println("Enter again for what knight do you want to add equipment?");
            ch_elem = scan.nextInt();
        }
        double money = elem1.getElem(ch_elem).getAvailable_money();
        e.get(ch_elem).printList();
        boolean isHelmet = false;
        boolean isBoots = false;
        boolean isBreastplate = false;
        boolean isShield = false;
        int count_of_chosen = e.get(ch_elem).getSize();
        for(int i = 0;i < e.get(ch_elem).getSize();i++)
        {
            for(int j = 0;j < 1000;j++)
            {
                if(e.get(ch_elem).getElem(i) == list.getElem(j))
                {
                    if(j >= 0 && j < 250)
                    {
                        isHelmet = true;
                    }
                    if(j >= 250 && j < 500)
                    {
                        isBreastplate = true;
                    }
                    if(j >= 500 && j < 750)
                    {
                        isBoots = true;
                    }
                    if(j >= 750)
                    {
                        isShield = true;
                    }
                }
            }
        }
        int ch1 = 1;
        int ch_el;
        while(ch1 != 0 && money > 0)
        {
            System.out.println("Enter what equipment do you want to add for your knight:"
                    + "\nHelmet - 1" + "\nBreastplate - 2" + "\nBoots - 3" + "\nShield - 4" + "\nNext knight or exit - 0");
            ch1 = scan.nextInt();
            if(ch1 == 1 && !isHelmet)
            {
                list.Filter(0,250);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_el = scan.nextInt();
                ch_el -= 1;
                while (ch_el > 249 || ch_el < 0)
                {
                    ch_el = scan.nextInt();
                    ch_el -= 1;
                }
                if (money - list.getElem(ch_el).getCost() > 0)
                {
                    money -= list.getElem(ch_el).getCost();
                    e.get(ch_elem).addElem(list.getElem(ch_el),count_of_chosen);
                    isHelmet = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if(ch1 == 2 && !isBreastplate)
            {
                list.Filter(250,500);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_el = scan.nextInt();
                ch_el -= 1;
                while (ch_el > 499 || ch_el < 250)
                {
                    ch_el = scan.nextInt();
                    ch_el -= 1;
                }
                if (money - list.getElem(ch_el).getCost() > 0) {
                    money -= list.getElem(ch_el).getCost();
                    e.get(ch_elem).addElem(list.getElem(ch_el),count_of_chosen);
                    isBreastplate = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if(ch1 == 3 && !isBoots)
            {
                list.Filter(500,750);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_el = scan.nextInt();
                ch_el -= 1;
                while (ch_el > 749 || ch_el < 500)
                {
                    ch_el = scan.nextInt();
                    ch_el -= 1;
                }
                if (money - list.getElem(ch_el).getCost() > 0) {
                    money -= list.getElem(ch_el).getCost();
                    e.get(ch_elem).addElem(list.getElem(ch_el),count_of_chosen);
                    isBoots = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if (ch1 == 4 && !isShield)
            {
                list.Filter(750,1000);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_el = scan.nextInt();
                ch_el -= 1;
                while (ch_el > 999 || ch_el < 750)
                {
                    ch_el = scan.nextInt();
                    ch_el -= 1;
                }
                if (money - list.getElem(ch_el).getCost() > 0) {
                    money -= list.getElem(ch_el).getCost();
                    e.get(ch_elem).addElem(list.getElem(ch_el),count_of_chosen);
                    isShield = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            System.out.println("Available money is:" + money);
            elem1.getElem(ch_elem).setAvailable_money(money);
        }
        e.get(ch_elem).printList();
    }
    public void addWeapon()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter for what knight do you want to add equipment?");
        int ch_elem = scan.nextInt();
        while (ch_elem >= elem1.getSize() || ch_elem < 0)
        {
            System.out.println("Enter again for what knight do you want to add equipment?");
            ch_elem = scan.nextInt();
        }
        double money = elem1.getElem(ch_elem).getAvailable_money();
        w.get(ch_elem).printList();
        boolean isBow = false;
        boolean isSpear = false;
        boolean isHeavy = false;
        boolean isSword = false;
        int count_of_chosen = w.get(ch_elem).getSize();
        for(int i = 0;i < w.get(ch_elem).getSize();i++)
        {
            for(int j = 0;j < 1000;j++)
            {
                if(w.get(ch_elem).getElem(i) == wlist.getElem(j))
                {
                    if(j >= 0 && j < 250)
                    {
                        isBow = true;
                    }
                    if(j >= 250 && j < 500)
                    {
                        isHeavy = true;
                    }
                    if(j >= 500 && j < 750)
                    {
                        isSpear = true;
                    }
                    if(j >= 750)
                    {
                        isSword = true;
                    }
                }
            }
        }
        int ch1 = 1;
        int ch_el;
        while(ch1 != 0 && money > 0)
        {
            System.out.println("Enter what equipment do you want to add for your knight:"
                    + "\nBow - 1" + "\nHeavyWeapon - 2" + "\nSpear - 3" + "\nSword - 4" + "\nNext knight or exit - 0");
            ch1 = scan.nextInt();
            if(ch1 == 1 && !isBow)
            {
                wlist.filtrList(0,250);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_el = scan.nextInt();
                ch_el -= 1;
                while (ch_el > 249 || ch_el < 0)
                {
                    ch_el = scan.nextInt();
                    ch_el -= 1;
                }
                if (money - wlist.getElem(ch_el).getCost() > 0)
                {
                    money -= wlist.getElem(ch_el).getCost();
                    w.get(ch_elem).addElem(wlist.getElem(ch_el),count_of_chosen);
                    isBow = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if(ch1 == 2 && !isHeavy)
            {
                wlist.filtrList(250,500);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_el = scan.nextInt();
                ch_el -= 1;
                while (ch_el > 499 || ch_el < 250)
                {
                    ch_el = scan.nextInt();
                    ch_el -= 1;
                }
                if (money - wlist.getElem(ch_el).getCost() > 0) {
                    money -= wlist.getElem(ch_el).getCost();
                    w.get(ch_elem).addElem(wlist.getElem(ch_el),count_of_chosen);
                    isHeavy = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if(ch1 == 3 && !isSpear)
            {
                wlist.filtrList(500,750);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_el = scan.nextInt();
                ch_el -= 1;
                while (ch_el > 749 || ch_el < 500)
                {
                    ch_el = scan.nextInt();
                    ch_el -= 1;
                }
                if (money - wlist.getElem(ch_el).getCost() > 0) {
                    money -= wlist.getElem(ch_el).getCost();
                    w.get(ch_elem).addElem(wlist.getElem(ch_el),count_of_chosen);
                    isSpear = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            if (ch1 == 4 && !isSword)
            {
                wlist.filtrList(750,1000);
                //list.FilterParam(0,250);
                System.out.println("Enter the number of element that you want to buy:");
                ch_el = scan.nextInt();
                ch_el -= 1;
                while (ch_el > 999 || ch_el < 750)
                {
                    ch_el = scan.nextInt();
                    ch_el -= 1;
                }
                if (money - wlist.getElem(ch_el).getCost() > 0) {
                    money -= wlist.getElem(ch_el).getCost();
                    w.get(ch_elem).addElem(wlist.getElem(ch_el),count_of_chosen);
                    isSword = true;
                    count_of_chosen++;
                }
                else
                {
                    System.out.println("You have not enough money , try to choose another equipment");
                }
            }
            System.out.println("Available money is:" + money);
            elem1.getElem(ch_elem).setAvailable_money(money);
        }
        w.get(ch_elem).printList();
    }
}
