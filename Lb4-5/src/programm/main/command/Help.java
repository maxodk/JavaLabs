package programm.main.command;

public class Help implements InterfaceConsole{
    @Override
    public CommandResult<String> execute() throws Exception {
        System.out.println("Help works!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","test works",true);
        return result;
    }
}
