package programm.main.command;

public class Log_out implements InterfaceConsole{
    @Override
    public CommandResult<String> execute() throws ExceptionInInitializerError  {
        System.out.println("Logging out works!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","test works",true);
        return result;
    }
}
