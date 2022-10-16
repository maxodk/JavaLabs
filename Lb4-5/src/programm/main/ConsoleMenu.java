package programm.main;

import programm.main.command.*;

import java.util.Scanner;

public class ConsoleMenu {
    public void Menu2() throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();
        while(ch != 0)
        {
            InterfaceConsole com;
            switch (ch)
            {
                case 1:
                    InterfaceConsole a = new Select_equipment();
                    CommandResult res = a.execute();
                    System.out.println(res.Result());
                    if(res.isSucceed())
                    {
                        InterfaceConsole g = new Calculate_data();
                        CommandResult res6 = g.execute();
                        System.out.println(res6.Result());
                    }
                    break;
                case 2:
                    InterfaceConsole b = new Add_equipment();
                    CommandResult res1 = b.execute();
                    System.out.println(res1.Result());
                    break;
                case 3:
                    InterfaceConsole c = new Update_equipment();
                    CommandResult res2 = c.execute();
                    System.out.println(res2.Result());
                    break;
                case 4:
                    InterfaceConsole d = new Delete_equipment();
                    CommandResult res3 = d.execute();
                    System.out.println(res3.Result());
                    break;
                case 5:
                    InterfaceConsole e = new Log_out();
                    CommandResult res4 = e.execute();
                    System.out.println(res4.Result());
                    break;
                case 6:
                    InterfaceConsole f = new Build_report();
                    CommandResult res5 = f.execute();
                    System.out.println(res5.Result());
                    break;
                default:break;
            }
            System.out.println("Select your action:\nselect equipment for knight - 1" +
            "\nadd equipment - 2\nupdate equipment - 3\ndelete equipment - 4\nlog out - 5\nbuild report - 6");
            ch = scan.nextInt();
        }
    }
    public void Menu() throws Exception {
        System.out.println("Welcome to menu.What you want?\nhelp - 1\nregister - 2\nlog in - 3\n");
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();
        while(ch != 0)
        {
            switch (ch)
            {
                case 1:
                {
                    InterfaceConsole a = new Help();
                    CommandResult res = a.execute();
                    System.out.println(res.Result());
                    break;
                }
                case 2:
                {
                    InterfaceConsole b = new Register();
                    CommandResult res = b.execute();
                    System.out.println(res.Result());
                    System.out.println("Thank you for registration.Select your action:\nselect equipment for knight - 1" +
                            "            \nadd equipment - 2\nupdate equipment - 3\ndelete equipment - 4\nlog out - 5\nbuild report - 6");
                    if(res.isSucceed())
                    {
                        Menu2();
                    }
                    break;
                }
                case 3:
                {
                    InterfaceConsole c = new Log_in();
                    CommandResult res = c.execute();
                    System.out.println(res.Result());
                    System.out.println("Thank you for logging in.Select your action:\nselect equipment for knight - 1" +
                            "            \nadd equipment - 2\nupdate equipment - 3\ndelete equipment - 4\nlog out - 5\nbuild report - 6");
                    if(res.isSucceed())
                    {
                        Menu2();
                    }
                    break;
                }
                default:break;
            }
            System.out.println("Welcome to menu.What you want?\nhelp - 1\nlog in - 2\nregister - 3");
            ch = scan.nextInt();
        }
    }
}
