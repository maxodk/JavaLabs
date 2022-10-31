package main;

import data.EquipmentData;
import data.KnightData;
import data.WeaponData;
import database.Connect;
import equipment.Equipment;
import equipment.Helmet;
import menu.ConsoleMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ConsoleMenu enter = new ConsoleMenu();
        /*EquipmentData list = new EquipmentData();
        list.fillEquipment();
        list.printList();*/
        /*WeaponData list = new WeaponData();
        list.fillList();
        list.printList();*/
        Connect c = new Connect();
        c.method();
        enter.Menu();
        /*Equipment a = new Equipment(30,15,"Iron",0.5);
        Helmet b = new Helmet(30,50,"Gold",0.3,"Close");
        System.out.println(a.ReturnCost());
        System.out.println(b.ReturnCost());*/
    }
}
