package headFirstDP.command.commands;

import headFirstDP.command.product.GarageDoor;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        System.out.println("GarageDoor if Down");
    }

    @Override
    public void undo() {

    }
}
