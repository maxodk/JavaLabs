package main;

import knight.Ammunition;
import knight.Helmet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to menu.What you want?\nhelp - 1\nequip knight - 2\nwrite data to file - 3");
        Ammunition a = new Ammunition(30,15,"Iron",0.5);
        Helmet b = new Helmet(30,50,"Gold",0.3,"Close");
        System.out.println(a.ReturnCost());
        System.out.println(b.ReturnCost());
    }
}