package programm.main.command;

public class Calculate_data implements InterfaceConsole {
    @Override
    public CommandResult<String> execute() throws Exception {
        System.out.println("Calculating data works!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","test works",true);
        return result;
    }
}
