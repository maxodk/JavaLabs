package commandstest;

import command.CommandResult;
import command.DeleteEquipment;
import data.EquipmentData;
import data.KnightData;
import data.WeaponData;
import knight.Knight;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class TestDelete {
    private static KnightData elem1 = new KnightData();
    private static EquipmentData list = new EquipmentData();
    private static ArrayList<EquipmentData> e = new ArrayList<>();
    private static WeaponData wlist = new WeaponData();
    private static ArrayList<WeaponData> w = new ArrayList<>();
    private static CommandResult<String> result;
    @BeforeClass
    public static void set()
    {
        result = new CommandResult<String>("Succeed!!!!!","Deleting works!",true);
    }
    @Test
    public void testExecute() throws Exception
    {
        CommandResult<String> result1 = new CommandResult<String>("Failed!!!!!","Deleting failed!You dont have any knight for deleting",true);
        DeleteEquipment deleteEquipment = new DeleteEquipment(elem1,list,e,wlist,w);
        Assert.assertEquals("Test failed",result1.Result(),deleteEquipment.execute().Result());
    }
    @Test
    public void testExecute2() throws Exception
    {
        elem1.addElem(0,new Knight("Maks",18,15000));
        String simulatedUserInput = "0" +  System.getProperty("line.separator")
                +"2" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        DeleteEquipment deleteEquipment = new DeleteEquipment(elem1,list,e,wlist,w);
        Assert.assertEquals("Test failed",result.Result(),deleteEquipment.execute().Result());
    }
    @Test
    public void testDelEquip()
    {
        e.add(0,new EquipmentData());
        DeleteEquipment deleteEquipment = new DeleteEquipment(elem1,list,e,wlist,w);
        deleteEquipment.delEquip(0);
    }
    @Test
    public void testDelEquip2()
    {
        e.add(0,new EquipmentData());
        list.fillEquipment();
        e.get(0).addElem(list.getElem(4),0);
        String simulatedUserInput = "1";
        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        DeleteEquipment deleteEquipment = new DeleteEquipment(elem1,list,e,wlist,w);
        deleteEquipment.delEquip(0);
    }
    @Test
    public void testDelWeapon()
    {
        w.add(0,new WeaponData());
        DeleteEquipment deleteEquipment = new DeleteEquipment(elem1,list,e,wlist,w);
        deleteEquipment.delWeapon(0);
    }
    @Test
    public void testDelWeapon2()
    {
        w.add(0,new WeaponData());
        wlist.fillList();
        w.get(0).addElem(wlist.getElem(4),0);
        String simulatedUserInput = "1";
        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        DeleteEquipment deleteEquipment = new DeleteEquipment(elem1,list,e,wlist,w);
        deleteEquipment.delWeapon(0);
    }
}
