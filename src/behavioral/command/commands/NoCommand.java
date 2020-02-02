package behavioral.command.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("This Button has No Action");
    }

    @Override
    public void undo() {
        System.out.println("This Button has No Action");
    }
}
