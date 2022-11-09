package menutest;

import command.CommandResult;
import menu.ConsoleMenu;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class TestConsoleMenu {
    private static ArrayList<CommandResult<String>> resultArrayList = new ArrayList<>();
    private static ArrayList<java.util.Date> dates = new ArrayList<>();
    @Test
    public void testmenu() throws Exception
    {
        String simulatedUserInput = "1" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        ConsoleMenu menu = new ConsoleMenu();
        menu.Menu();
    }
    @Test
    public void testmenu2() throws Exception
    {
        String simulatedUserInput = "6" +  System.getProperty("line.separator")
                +"6" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        ConsoleMenu menu = new ConsoleMenu();
        menu.Menu2();
    }
}
