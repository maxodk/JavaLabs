package commandstest;

import command.AddEquipment;
import command.CommandResult;
import data.EquipmentData;
import data.KnightData;
import data.WeaponData;
import equipment.Equipment;
import equipment.Helmet;
import knight.Knight;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.*;
import org.junit.jupiter.engine.descriptor.ClassTestDescriptor;
import org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor;
import org.junit.rules.Verifier;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.configuration.IMockitoConfiguration;
import java.io.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class TestAdd {
    private final static InputStream systemIn = System.in;
    private final static PrintStream systemOut = System.out;
    private ByteArrayInputStream typeIn;
    private static ByteArrayOutputStream typeOut;
    @Mock
    private static KnightData elem1 = new KnightData();
    @Mock
    private static EquipmentData list = new EquipmentData();
    @Mock
    private static ArrayList<EquipmentData> e = new ArrayList<EquipmentData>();
    @Mock
    private static WeaponData wlist = new WeaponData();
    @Mock
    private static ArrayList<WeaponData> w = new ArrayList<WeaponData>();
    @Mock
    private static CommandResult<String> result;
    @Mock
    private static AddEquipment addEquipment = new AddEquipment(elem1,list,e,wlist,w);
    @BeforeClass
    public static void setValues()
    {
        result = new CommandResult<String>("Succeed!!!!","Add working!",true);
        int size = 1;
        list.fillEquipment();
        wlist.fillList();
        elem1.addElem(0,new Knight("Maks",17,15000));
    }
    @Test
    public void testExecute() throws Exception
    {
        String simulatedUserInput = "2";
        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",result.Result(),addEquipment.execute().Result());
    }
    @Test
    public void testAddEquip()
    {
        String simulatedUserInput = "1" + System.getProperty("line.separator") +
                "y" + System.getProperty("line.separator") +
                "ID001" + System.getProperty(" line.separator") +
                "100" + System.getProperty("line.separator") +
                "c" + System.getProperty("line.separator") +
                "300" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addEquip());
    }
    @Test
    public void testAddEquip2()
    {
        e.add(0,new EquipmentData());
        e.get(0).addElem(list.getElem(4),0);
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "2" + System.getProperty("line.separator")+
                "311" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addEquip());
    }
    @Test
    public void testAddEquip3()
    {
        e.add(0,new EquipmentData());
        e.get(0).addElem(list.getElem(311),0);
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "1" + System.getProperty("line.separator")+
                "63" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addEquip());
    }
    @Test
    public void testAddEquip4()
    {
        e.add(0,new EquipmentData());
        e.get(0).addElem(list.getElem(1),0);
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "3" + System.getProperty("line.separator")+
                "563" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addEquip());
    }
    @Test
    public void testAddEquip5()
    {
        e.add(0,new EquipmentData());
        e.get(0).addElem(list.getElem(311),0);
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "4" + System.getProperty("line.separator")+
                "763" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addEquip());
    }
    @Test
    public void testAddWeapon()
    {
        String simulatedUserInput = "1" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator") +
                "ID001" + System.getProperty(" line.separator") +
                "100" + System.getProperty("line.separator") +
                "c" + System.getProperty("line.separator") +
                "300" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addWeapon());
    }
    @Test
    public void testAddWeapon2()
    {
        w.add(0,new WeaponData());
        w.get(0).addElem(wlist.getElem(4),0);
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "2" + System.getProperty("line.separator")+
                "311" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addWeapon());
    }
    @Test
    public void testAddWeapon3()
    {
        w.add(0,new WeaponData());
        w.get(0).addElem(wlist.getElem(311),0);
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "1" + System.getProperty("line.separator")+
                "11" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addWeapon());
    }
    @Test
    public void testAddWeapon4()
    {
        w.add(0,new WeaponData());
        w.get(0).addElem(wlist.getElem(4),0);
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "3" + System.getProperty("line.separator")+
                "611" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addWeapon());
    }
    @Test
    public void testAddWeapon5()
    {
        w.add(0,new WeaponData());
        w.get(0).addElem(wlist.getElem(4),0);
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "4" + System.getProperty("line.separator")+
                "911" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        System.setIn(new  ByteArrayInputStream(simulatedUserInput.getBytes()));
        Assert.assertEquals("Test failed",true,addEquipment.addWeapon());
    }
}
