package behavioral.command;

public class CommandPattern {
	public static void main(String[] args) {
		Command com1 = new AlarmCommand(new Alarm());
		Button bn1 = new Button(com1);
		bn1.pressed(true);
		bn1.pressed(false);
		
		com1 = new LampCommand(new Lamp());
		bn1 = new Button(com1);
		bn1.pressed(true);
		bn1.pressed(false);
	}
}
