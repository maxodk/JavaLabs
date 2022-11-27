package commandstest;

import command.SendEmail;
import org.junit.Test;

public class TestSend {
    @Test
    public void Test()
    {
        SendEmail sendEmail = new SendEmail();
        sendEmail.send();
    }
}

