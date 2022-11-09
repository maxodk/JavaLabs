package datatests;

import data.KnightData;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class TestKnightData {
    public static KnightData elem1 = new KnightData();
    @Test
    public void test()
    {
        String simulatedUserInput = "Maks" +  System.getProperty("line.separator")
                +"18" +  System.getProperty("line.separator")
                +"15000" +  System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        elem1.fillKnight(1);
    }
}
