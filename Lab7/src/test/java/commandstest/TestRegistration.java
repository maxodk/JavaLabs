package commandstest;

import command.CommandResult;
import command.Register;
import data.UserData;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;

public class TestRegistration {
    @Mock
    private static UserData list = new UserData();
    @Mock
    private static CommandResult<String> result;
    @BeforeClass
    public static void set() throws Exception
    {
        list.ReadFromFile();
        list.printList();
        result = new CommandResult<String>("Succeed!!!!!","Registration works!",true);
    }
    @Test
    public void test() throws Exception
    {
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "1" + System.getProperty("line.separator")+
                "1" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        Register register = new Register(list);
        Assert.assertEquals("Test failed",result.Result(),register.execute().Result());
    }
    @Test
    public void test2() throws Exception
    {
        String simulatedUserInput = "2" + System.getProperty("line.separator")+
                "2" + System.getProperty("line.separator")+
                "2" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        Register register = new Register(list);
        Assert.assertEquals("Test failed",result.Result(),register.execute().Result());
    }
}
