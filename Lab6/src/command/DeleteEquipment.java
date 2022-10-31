package command;

import data.EquipmentData;
import data.KnightData;
import data.WeaponData;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteEquipment implements InterfaceConsole{
    private KnightData elem1;
    private EquipmentData list;
    private ArrayList<EquipmentData> e;
    private WeaponData wlist;
    private ArrayList<WeaponData> w;
    @Override
    public CommandResult<String> execute() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("For what knight do you want to delete equipment?");
        int ch_elem = scan.nextInt();
        while (ch_elem >= elem1.getSize() || ch_elem < 0)
        {
            if(elem1.getSize() == 0)
            {
                System.out.println("Deleting failed!You dont have any knight for deleting");
                return new CommandResult<String>("Failed!!!!!","Deleting failed!You dont have any knight for deleting",true);
            }
            System.out.println("Enter again for what knight do you want to delete equipment?");
            ch_elem = scan.nextInt();
        }
        System.out.println("Choose what you want to delete:equipment or weapon?");
        int ch = scan.nextInt();
        if(ch == 0)
        {
            delEquip(ch_elem);
        }
        if (ch == 1)
        {
            delWeapon(ch_elem);
        }
        System.out.println("Deleting works!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","Deleting works!",true);
        return result;
    }

    public DeleteEquipment(KnightData elem1, EquipmentData list, ArrayList<EquipmentData> e,WeaponData wlist,ArrayList<WeaponData> w) {

        this.elem1 = elem1;
        this.list = list;
        this.e = e;
        this.wlist = wlist;
        this.w = w;
    }
    public void delEquip(int ch_elem)
    {
        Scanner scan = new Scanner(System.in);
        e.get(ch_elem).printList();
        int ch = 1;
        int countofequip = e.get(ch_elem).getSize();
        while (ch != 0)
        {
            if (countofequip == 0)
            {
                break;
            }
            System.out.println("Enter what equipment do you want to delete for your knight:"
                    + "\nHelmet - 1" + "\nBreastplate - 2" + "\nBoots - 3" + "\nShield - 4" + "\nNext knight or exit - 0");
            ch = scan.nextInt();
            if(ch > 0)
            {
                elem1.getElem(ch_elem).setAvailable_money(e.get(ch_elem).getElem(ch - 1).getCost() + elem1.getElem(ch_elem).getAvailable_money());
                e.get(ch_elem).deleteElem(ch - 1);
                e.get(ch_elem).printList();
                countofequip -= 1;
            }
        }
        e.get(ch_elem).printList();
        System.out.println("Available money is " + elem1.getElem(ch_elem).getAvailable_money());
    }
    public void delWeapon(int ch_elem)
    {
        Scanner scan = new Scanner(System.in);
        w.get(ch_elem).printList();
        int ch = 1;
        int countofequip = w.get(ch_elem).getSize();
        while (ch != 0)
        {
            if (countofequip == 0)
            {
                break;
            }
            System.out.println("Enter what equipment do you want to delete for your knight:"
                    + "\nBow - 1" + "\nHeavyWeapon - 2" + "\nSpear - 3" + "\nSword - 4" + "\nNext knight or exit - 0");
            ch = scan.nextInt();
            if(ch > 0)
            {
                elem1.getElem(ch_elem).setAvailable_money(w.get(ch_elem).getElem(ch - 1).getCost() + elem1.getElem(ch_elem).getAvailable_money());
                w.get(ch_elem).deleteElem(ch - 1);
                w.get(ch_elem).printList();
                countofequip -= 1;
            }
        }
        w.get(ch_elem).printList();
        System.out.println("Available money is " + elem1.getElem(ch_elem).getAvailable_money());
    }
}
