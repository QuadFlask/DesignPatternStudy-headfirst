package command;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor command){
		garageDoor = command;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}

	@Override
	public void undo() {
	}
}
