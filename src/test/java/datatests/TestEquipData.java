package datatests;

import data.EquipmentData;
import equipment.Equipment;
import main.Main;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weapon.Weapon;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class TestEquipData {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    @Mock
    private static ArrayList<EquipmentData> e = new ArrayList<>();
    private static EquipmentData list = new EquipmentData();
    @BeforeClass
    public static void setValue()
    {
        logger.info("Main works");
        e.add(0,new EquipmentData());
        list.fillEquipment();
    }
    @Test
    public void testadd()
    {
        e.get(0).addElem(new Equipment(20,30,"Gold",0.5),0);
        Assert.assertEquals("Test failed",1,e.get(0).getSize());
    }
    @Test
    public void Filter()
    {
        String simulatedUserInput = "1" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"300" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void Filter2()
    {
        String simulatedUserInput = "1" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"300" +  System.getProperty("line.separator")
                +"1" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void Filter3()
    {
        String simulatedUserInput = "2" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"25" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void Filter4()
    {
        String simulatedUserInput = "2" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"25" +  System.getProperty("line.separator")
                +"1" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void Filter5()
    {
        String simulatedUserInput = "4" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"0,5" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void Filter6()
    {
        String simulatedUserInput = "4" +  System.getProperty("line.separator")
                +"0" +  System.getProperty("line.separator")
                +"0,5" +  System.getProperty("line.separator")
                +"1" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        list.FilterParam(0,250);
    }
    @Test
    public void Filter7()
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
        Equipment equipment = new Equipment(20,30,"Gold",0.5);
        equipment.toString();
    }
    @Test
    public void testSet()
    {
        Equipment equipment = new Equipment(20,30,"Gold",0.5);
        equipment.setCost(30);
        equipment.setMaterial("Silver");
        equipment.setWeight(15);
        equipment.setStrength(0.3);
        equipment.ReturnCost();
    }
}

