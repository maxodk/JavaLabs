package programm.main.command;

public class Delete_equipment implements InterfaceConsole{
    @Override
    public CommandResult<String> execute() throws Exception {
        System.out.println("Deleting works!");
        CommandResult<String> result = new CommandResult<String>("Succeed!!!!!","test works",true);
        return result;
    }
}
