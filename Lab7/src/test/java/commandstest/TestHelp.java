package commandstest;

import command.CommandResult;
import command.Help;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;
import org.mockito.internal.matchers.Null;

public class TestHelp {
    @Mock
    private static CommandResult<String>  result;
    @BeforeClass
    public static void setResult()
    {
        result = new CommandResult<String>("Critical error!","Help works!",true);
    }
    @Test
    @DisplayName("Test help works!")
    public void test() throws Exception {
        Help s = new Help();
        CommandResult<String> res = s.execute();
        Assert.assertEquals("Test fails",res.Result(),result.Result());
    }
}

