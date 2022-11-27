package commandstest;

import command.CalculateData;
import command.CommandResult;
import data.EquipmentData;
import data.KnightData;
import data.WeaponData;
import knight.Knight;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

public class TestCalculate {
    @Mock
    private static KnightData elem1 = new KnightData();
    @Mock
    private static ArrayList<EquipmentData> e = new ArrayList<>();
    @Mock
    private static ArrayList<WeaponData> w = new ArrayList<>();
    @Mock
    private static CommandResult<String> result;
    @BeforeClass
    public static void setValues()
    {
        result = new CommandResult<String>("Succeed!!!!","Add working!",true);
        int size = 1;
        elem1.addElem(0,new Knight("Maks",17,15000));
    }
    @Test
    public void testExecute() throws Exception
    {
        CalculateData calculateData = new CalculateData(elem1,e,w);
        calculateData.execute();
    }
}

