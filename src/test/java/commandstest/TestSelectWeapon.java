package commandstest;

import command.CommandResult;
import command.SelectEquipment;
import command.SelectWeapon;
import data.EquipmentData;
import data.KnightData;
import data.WeaponData;
import knight.Knight;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class TestSelectWeapon {
    private static KnightData elem1 = new KnightData();
    private static WeaponData list = new WeaponData();
    private static ArrayList<WeaponData> wdata = new ArrayList<>();
    private static CommandResult<String> result;
    @BeforeClass
    public static void set()
    {
        result = new CommandResult<String>("Succeed!!!!!","Select weapon works!",true);
    }
    @Test
    public void testExecute() throws Exception
    {
        String simulatedUserInput = "0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        SelectWeapon selectWeapon = new SelectWeapon(elem1,list,wdata);
        Assert.assertEquals("Test failed",result.Result(),selectWeapon.execute().Result());
    }
    @Test
    public void testExecute2() throws Exception
    {
        elem1.addElem(0,new Knight("Maks",18,15000));
        wdata.add(0,new WeaponData());
        list.fillList();
        wdata.get(0).addElem(list.getElem(4),0);
        String simulatedUserInput = "0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        SelectWeapon selectWeapon = new SelectWeapon(elem1,list,wdata);
        Assert.assertEquals("Test failed",result.Result(),selectWeapon.execute().Result());
    }
    @Test
    public void testEquip()
    {
        elem1.addElem(0,new Knight("Maks",18,15000));
        wdata.add(0,new WeaponData());
        list.fillList();
        String simulatedUserInput = "1" +  System.getProperty("line.separator")
                +"50" +  System.getProperty("line.separator")
                +"2" +  System.getProperty("line.separator")
                +"350" +  System.getProperty("line.separator")
                +"3" +  System.getProperty("line.separator")
                +"520" +  System.getProperty("line.separator")
                +"4" +  System.getProperty("line.separator")
                +"820" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        SelectWeapon selectWeapon = new SelectWeapon(elem1,list,wdata);
        selectWeapon.equip(0);
    }
}

