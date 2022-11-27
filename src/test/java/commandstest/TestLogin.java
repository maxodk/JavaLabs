package commandstest;

import command.CommandResult;
import command.LogIn;
import data.UserData;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayInputStream;

public class TestLogin {
    @Mock
    private static UserData list = new UserData();
    @Mock
    private static CommandResult<String> result;
    @BeforeClass
    public static void set() throws Exception
    {
        list.ReadFromFile();
        list.printList();
    }
    @Test
    public void test1()
    {
        String simulatedUserInput = "2" + System.getProperty("line.separator")+
                "2" + System.getProperty("line.separator")+
                "2" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        result = new CommandResult<String>("Succeed!!!!!","Log in failed!",false);
        LogIn login = new LogIn(list);
        Assert.assertEquals("Test failed",result.Result(),login.execute().Result());
    }
    @Test
    public void test2()
    {
        String simulatedUserInput = "1" + System.getProperty("line.separator")+
                "1" + System.getProperty("line.separator")+
                "1" + System.getProperty("line.separator");
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        result = new CommandResult<String>("Succeed!!!!!","Log in successful!",true);
        LogIn login = new LogIn(list);
        Assert.assertEquals("Test failed",result.Result(),login.execute().Result());
    }
}

