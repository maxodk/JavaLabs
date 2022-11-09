package commandstest;

import command.CommandResult;
import command.SelectEquipment;
import data.EquipmentData;
import data.KnightData;
import knight.Knight;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class TestSelectEquipment {
    private static KnightData elem1 = new KnightData();
    private static EquipmentData list = new EquipmentData();
    private static ArrayList<EquipmentData> e = new ArrayList<>();
    private static CommandResult<String> result;
    @BeforeClass
    public static void set()
    {
        result = new CommandResult<String>("Succeed!!!!!","Select equipment works!",true);
    }
    @Test
    public void testExecute() throws Exception
    {
        String simulatedUserInput = "0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        SelectEquipment selectEquipment= new SelectEquipment(elem1,list,e);
        Assert.assertEquals("Test failed",result.Result(),selectEquipment.execute().Result());
    }
    @Test
    public void testExecute2() throws Exception
    {
        elem1.addElem(0,new Knight("Maks",18,15000));
        e.add(0,new EquipmentData());
        list.fillEquipment();
        e.get(0).addElem(list.getElem(4),0);
        String simulatedUserInput = "0" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        SelectEquipment selectEquipment= new SelectEquipment(elem1,list,e);
        Assert.assertEquals("Test failed",result.Result(),selectEquipment.execute().Result());
    }
    @Test
    public void testEquip()
    {
        elem1.addElem(0,new Knight("Maks",18,15000));
        e.add(0,new EquipmentData());
        list.fillEquipment();
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
        SelectEquipment selectEquipment= new SelectEquipment(elem1,list,e);
        selectEquipment.equip(0);
    }
}
