package main;

import command.SendEmail;
import data.EquipmentData;
import data.KnightData;
import data.WeaponData;
import database.Connect;
import database.Select;
import equipment.Equipment;
import equipment.Helmet;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import menu.ConsoleMenu;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.Main.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    private static final Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws Exception {
        ConsoleMenu enter = new ConsoleMenu();
        Scanner scanner = new Scanner(System.in);
        launch();
        log.info("TEST");
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


