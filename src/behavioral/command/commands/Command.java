package behavioral.command.commands;

public interface Command {
    public void execute();
    public void undo();
}
