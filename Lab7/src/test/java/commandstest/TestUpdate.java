package commandstest;

import command.CommandResult;
import command.UpdateEquipment;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUpdate {
    private static CommandResult<String> result;
    @BeforeClass
    public static void setResult()
    {
        result = new CommandResult<String>("Succeed!!!!!","Updating works!",true);
    }
    @Test
    public void test() throws Exception
    {
        UpdateEquipment updateEquipment = new UpdateEquipment();
        Assert.assertEquals("Test failed",result.Result(),updateEquipment.execute().Result());
    }
}
