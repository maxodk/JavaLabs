package datatests;

import data.WeaponData;
import org.junit.BeforeClass;
import org.junit.Test;
import weapon.Weapon;

import java.io.ByteArrayInputStream;

public class TestWepData {
    private static WeaponData list = new WeaponData();
    @BeforeClass
    public static void set()
    {
        list.fillList();
    }
    @Test
    public void filter()
    {
        String simulatedUserInput = "1" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"300" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void filter2()
    {
        String simulatedUserInput = "1" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"300" +  System.getProperty("line.separator")
                +"1" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void filter3()
    {
        String simulatedUserInput = "2" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"15" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void filter4()
    {
        String simulatedUserInput = "2" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"15" +  System.getProperty("line.separator")
                +"1" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void filter5()
    {
        String simulatedUserInput = "4" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"0,5" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void filter6()
    {
        String simulatedUserInput = "4" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"0,5" +  System.getProperty("line.separator")
                +"1" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void filter7()
    {
        String simulatedUserInput = "3" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"Gold" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void tostring()
    {
        Weapon weapon = new Weapon(20,30,"Gold",0.5);
        weapon.toString();
    }
    @Test
    public void testSet()
    {
        Weapon weapon = new Weapon(20,30,"Gold",0.5);
        weapon.setCost(30);
        weapon.setWeight(15);
        weapon.setType("Silver");
        weapon.setStrength(0.3);
    }
}

