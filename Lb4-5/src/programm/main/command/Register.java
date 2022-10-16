package programm.main.command;

public class Register implements InterfaceConsole{

    @Override
    public CommandResult<String> execute() throws ExceptionInInitializerError {
        System.out.println("You are registered!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","test works",true);
        return result;
    }
}
