package programm.main.command;

public class Select_equipment implements InterfaceConsole{
    @Override
    public CommandResult<String> execute() throws Exception {
        System.out.println("Select equipment works!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","test works",true);
        return result;
    }
}
