package commandstest;

import command.BuildReport;
import command.CommandResult;
import command.Help;
import data.UserData;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Date;

public class TestBuildReport {
    @Mock
    private static CommandResult<String> result;
    @Mock
    private static CommandResult<String> result2;
    @Mock
    private static ArrayList<CommandResult<String>> list = new ArrayList<>();
    @Mock
    private static ArrayList<java.util.Date> dates = new ArrayList<>();
    @BeforeClass
    public static void setResult()
    {
        result = new CommandResult<String>("Succeed!!!!!","List is empty!",true);
        result2 = new CommandResult<String>("Succeed!!!!!","Building report works!",true);
    }
    @Test
    @DisplayName("Test build report works!")
    public void test() throws Exception {
        BuildReport s = new BuildReport(list,dates);
        CommandResult<String> res = s.execute();
        Assert.assertEquals("Test fails",res.Result(),result.Result());
    }
    @Test
    @DisplayName("Test with sized list")
    public void test2() throws Exception{
        list.add(0,new CommandResult<String>("Succeed!!!!!","Building report works!",true));
        long millis = System.currentTimeMillis();
        dates.add(0,new Date(millis));
        BuildReport s = new BuildReport(list,dates);
        CommandResult<String> res = s.execute();
        Assert.assertEquals("Test fails",res.Result(),result2.Result());
    }
}
