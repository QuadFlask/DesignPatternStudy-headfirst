package command;

public class CelingFanHighCommand implements Command {
	CelingFan celingFan;
	int prevSpeed;

	public CelingFanHighCommand(CelingFan celingFan) {
		this.celingFan = celingFan;
	}

	@Override
	public void execute() {
		prevSpeed = celingFan.getSpeed();
		celingFan.high();
	}

	@Override
	public void undo() {
		if (prevSpeed == CelingFan.HIGH)
			celingFan.high();
		else if (prevSpeed == celingFan.MEDIUM)
			celingFan.medium();
		else if (prevSpeed == celingFan.LOW)
			celingFan.low();
		else if (prevSpeed == celingFan.OFF)
			celingFan.off();
	}
}
