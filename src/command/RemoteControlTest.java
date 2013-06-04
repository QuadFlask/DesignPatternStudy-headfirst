package command;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);

		Stereo stereo = new Stereo();
		StreoOnWithCDCommand stereoCD = new StreoOnWithCDCommand(stereo);

		Command[] partyOn = {lightOn, doorOpen, stereoCD};

		MacroCommand partyOnCommand = new MacroCommand(partyOn);

		System.out.println(remote.toString());
		remote.setCommand(0, partyOnCommand, partyOnCommand);
		remote.onButtonWasPushed(0);
		System.out.println(remote.toString());
	}
}
