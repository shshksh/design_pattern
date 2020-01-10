package headFirstDP.command.commands;

import headFirstDP.command.product.CeilingFan;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
