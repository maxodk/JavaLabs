package programm.main.command;

public class Log_in implements InterfaceConsole{
    @Override
    public CommandResult<String> execute() throws ExceptionInInitializerError {
        System.out.println("Log in successful!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","test works",true);
        return result;
    }
}
